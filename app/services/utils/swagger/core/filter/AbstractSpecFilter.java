package services.utils.swagger.core.filter;

import models.apis.swagger.Model;
import models.apis.swagger.Operation;
import models.apis.swagger.parameters.Parameter;
import models.apis.swagger.properties.Property;
import services.utils.swagger.core.model.ApiDescription;

import java.util.List;
import java.util.Map;

public abstract class AbstractSpecFilter implements SwaggerSpecFilter {
    public boolean isOperationAllowed(
            Operation operation,
            ApiDescription api,
            Map<String, List<String>> params,
            Map<String, String> cookies,
            Map<String, List<String>> headers) {
        return true;
    }

    public boolean isParamAllowed(
            Parameter parameter,
            Operation operation,
            ApiDescription api,
            Map<String, List<String>> params,
            Map<String, String> cookies,
            Map<String, List<String>> headers) {
        return true;
    }

    public boolean isPropertyAllowed(
            Model model,
            Property property,
            String propertyName,
            Map<String, List<String>> params,
            Map<String, String> cookies,
            Map<String, List<String>> headers) {
        return true;
    }

    public boolean isRemovingUnreferencedDefinitions() {
        return false;
    }
}