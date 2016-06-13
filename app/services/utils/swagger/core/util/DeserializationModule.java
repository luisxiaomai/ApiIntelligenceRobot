package services.utils.swagger.core.util;

import com.fasterxml.jackson.databind.module.SimpleModule;
import models.apis.swagger.Model;
import models.apis.swagger.Path;
import models.apis.swagger.Response;
import models.apis.swagger.auth.SecuritySchemeDefinition;
import models.apis.swagger.parameters.Parameter;
import models.apis.swagger.properties.Property;


public class DeserializationModule extends SimpleModule {

    public DeserializationModule(boolean includePathDeserializer,
                                 boolean includeResponseDeserializer) {

        if (includePathDeserializer) {
            this.addDeserializer(Path.class, new PathDeserializer());
        }
        if (includeResponseDeserializer) {
            this.addDeserializer(Response.class, new ResponseDeserializer());
        }

        this.addDeserializer(Property.class, new PropertyDeserializer());
        this.addDeserializer(Model.class, new ModelDeserializer());
        this.addDeserializer(Parameter.class, new ParameterDeserializer());
        this.addDeserializer(SecuritySchemeDefinition.class, new SecurityDefinitionDeserializer());
    }

    public DeserializationModule() {
        this(true, true);
    }
}
