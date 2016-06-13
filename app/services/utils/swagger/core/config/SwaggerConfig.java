package services.utils.swagger.core.config;

import models.apis.swagger.Swagger;

public interface SwaggerConfig {

    Swagger configure(Swagger swagger);

    String getFilterClass();
}