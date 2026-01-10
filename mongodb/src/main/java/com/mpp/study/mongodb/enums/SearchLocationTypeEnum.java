package com.mpp.study.mongodb.enums;

public enum SearchLocationTypeEnum {
    REST("REST"),
    GRAPHQL("GRAPHQL"),
    DATABASE("DATABASE");

    private String value;

    SearchLocationTypeEnum(String val) {
        this.value = val;
    }
}
