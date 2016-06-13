package services.utils.swagger.parser.processors;

import models.apis.swagger.Model;
import models.apis.swagger.Swagger;
import models.apis.swagger.parameters.BodyParameter;
import models.apis.swagger.parameters.Parameter;
import models.apis.swagger.parameters.RefParameter;
import services.utils.swagger.parser.ResolverCache;

import java.util.ArrayList;
import java.util.List;


public class ParameterProcessor {

    private final ResolverCache cache;
    private final ModelProcessor modelProcessor;


    public ParameterProcessor(ResolverCache cache, Swagger swagger) {
        this.cache = cache;
        this.modelProcessor = new ModelProcessor(cache, swagger);
    }

    public List<Parameter> processParameters(List<Parameter> parameters) {

        if (parameters == null) {
            return null;
        }

        final List<Parameter> processedPathLevelParameters = new ArrayList<>();

        for (Parameter parameter : parameters) {

            if (parameter instanceof RefParameter) {
                RefParameter refParameter = (RefParameter) parameter;
                final Parameter resolvedParameter = cache.loadRef(refParameter.get$ref(), refParameter.getRefFormat(), Parameter.class);
                parameter = resolvedParameter;
            }

            if (parameter instanceof BodyParameter) {
                BodyParameter bodyParameter = (BodyParameter) parameter;
                final Model schema = bodyParameter.getSchema();
                modelProcessor.processModel(schema);
            }

            processedPathLevelParameters.add(parameter);

        }
        return processedPathLevelParameters;
    }
}
