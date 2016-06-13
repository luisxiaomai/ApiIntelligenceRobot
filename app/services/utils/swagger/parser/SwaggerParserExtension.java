package services.utils.swagger.parser;

import com.fasterxml.jackson.databind.JsonNode;
import models.apis.swagger.Swagger;
import models.apis.swagger.auth.AuthorizationValue;
import services.utils.swagger.parser.util.SwaggerDeserializationResult;

import java.io.IOException;
import java.util.List;

public interface SwaggerParserExtension {
    SwaggerDeserializationResult readWithInfo(JsonNode node);
    SwaggerDeserializationResult readWithInfo(String location, List<AuthorizationValue> auths);
    Swagger read(String location, List<AuthorizationValue> auths) throws IOException;
    Swagger read(JsonNode node) throws IOException;
}