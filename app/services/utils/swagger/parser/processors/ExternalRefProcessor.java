package services.utils.swagger.parser.processors;

import models.apis.swagger.Model;
import models.apis.swagger.Swagger;
import models.apis.swagger.properties.Property;
import models.apis.swagger.properties.RefProperty;
import models.apis.swagger.refs.RefFormat;
import services.utils.swagger.parser.ResolverCache;

import java.util.HashMap;
import java.util.Map;

import static services.utils.swagger.parser.util.RefUtils.computeDefinitionName;
import static services.utils.swagger.parser.util.RefUtils.deconflictName;
import static services.utils.swagger.parser.util.RefUtils.isAnExternalRefFormat;

public final class ExternalRefProcessor {
    private final ResolverCache cache;
    private final Swagger swagger;

    public ExternalRefProcessor(ResolverCache cache, Swagger swagger) {
        this.cache = cache;
        this.swagger = swagger;
    }

    public String processRefToExternalDefinition(String $ref, RefFormat refFormat) {
        final Model model = cache.loadRef($ref, refFormat, Model.class);

        String newRef;

        Map<String, Model> definitions = swagger.getDefinitions();

        if (definitions == null) {
            definitions = new HashMap<>();
        }

        final String possiblyConflictingDefinitionName = computeDefinitionName($ref);

        final Model existingModel = definitions.get(possiblyConflictingDefinitionName);

        if (existingModel != null) {
            //so this is either a conflict, or another reference to something we have previously renamed
            final String previouslyRenamedRef = cache.getRenamedRef($ref);
            if (previouslyRenamedRef != null) {
                //this is an additional reference to something we have renamed once
                newRef = previouslyRenamedRef;
            } else {
                //this is a conflict
                String deconflictedName = deconflictName(possiblyConflictingDefinitionName, definitions);
                cache.putRenamedRef($ref, deconflictedName);
                newRef = deconflictedName;
                swagger.addDefinition(deconflictedName, model);
            }

        } else {
            newRef = possiblyConflictingDefinitionName;
            cache.putRenamedRef($ref, newRef);

            
            //If this is a new model, then check it for other sub references
            //Loop the properties and recursively call this method;
            Map<String, Property> subProps = model.getProperties();
            if(subProps != null) {
                for (Map.Entry<String, Property> prop : subProps.entrySet()) {
                    if (prop.getValue() instanceof RefProperty) {
                        RefProperty subRef = (RefProperty) prop.getValue();

                        if(isAnExternalRefFormat(subRef.getRefFormat()))
                        	subRef.set$ref(processRefToExternalDefinition(subRef.get$ref(), subRef.getRefFormat()));
                    }
                }
            }
            swagger.addDefinition(newRef, model);
        }

        return newRef;
    }
}
