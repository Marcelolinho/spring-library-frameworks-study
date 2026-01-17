package com.mpp.study.mongodb.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Data
@NoArgsConstructor
@Document(collection = "character")
public class CharacterModel {

    @MongoId(targetType = FieldType.OBJECT_ID)
    private String id;

    private String name;
    private String description;
    private String show;
    private String gender;
    private String mainImage;
    private Map<String, Object> attributes;

    @DBRef
    private CharacterSearchLocationModel characterSearchLocation;

}
