package models.apis.swagger.properties;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import models.apis.swagger.Xml;

import java.util.Map;

public interface Property {
    Property title(String title);

    Property description(String description);

    String getType();

    String getFormat();

    String getTitle();

    void setTitle(String title);

    String getDescription();

    void setDescription(String title);

    @JsonIgnore
    String getName();

    void setName(String name);

    @JsonIgnore
    boolean getRequired();

    void setRequired(boolean required);

    @JsonGetter
    Object getExample();

    @JsonSetter
    void setExample(Object example);

    @Deprecated
    @JsonIgnore
    void setExample(String example);

    Boolean getReadOnly();

    void setReadOnly(Boolean readOnly);

    Integer getPosition();

    void setPosition(Integer position);

    Xml getXml();

    void setXml(Xml xml);

    void setDefault(String _default);

    @JsonIgnore
    String getAccess();

    @JsonIgnore
    void setAccess(String access);

    Map<String, Object> getVendorExtensions();
}
