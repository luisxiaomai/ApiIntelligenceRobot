package services.utils.swagger.core.util;


import models.apis.swagger.properties.PropertyBuilder;

import java.util.Map;

public interface AllowableValues {
    Map<PropertyBuilder.PropertyId, Object> asPropertyArguments();
}
