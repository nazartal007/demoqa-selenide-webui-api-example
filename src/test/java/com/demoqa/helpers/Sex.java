package com.demoqa.helpers;

public enum Sex {
    MALE("male"),
    FEMALE("female"),
    OTHER("other");

    public String getValue() {
        return value;
    }

    private String value;

    Sex(String value) {
        this.value = value;
    }
}
