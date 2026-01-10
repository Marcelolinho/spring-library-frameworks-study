package com.mpp.study.mongodb.model;

import com.mpp.study.mongodb.enums.SearchLocationTypeEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Map;

@Document(collection = "character_search_location")
public class CharacterSearchLocation {

    @MongoId(targetType = FieldType.OBJECT_ID)
    private String id;

    private String baseUrl;
    private SearchLocationTypeEnum searchLocationType;
    private String endpoint;
    private Boolean isApiSecured;
    private Map<String, Object> credentials;
}
