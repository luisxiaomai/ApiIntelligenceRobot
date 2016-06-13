package models.apis.swagger.parameters;

public class QueryParameter extends AbstractSerializableParameter<QueryParameter> {

    public QueryParameter() {
        super.setIn("query");
    }

    @Override
    protected String getDefaultCollectionFormat() {
        return "multi";
    }
}
