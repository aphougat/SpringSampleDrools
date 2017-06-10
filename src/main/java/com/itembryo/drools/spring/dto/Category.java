package com.itembryo.drools.spring.dto;

/**
 * Created by abhayphougat on 10/06/17.
 */
public enum Category {

    HIGH_VALUE("high_value","> 500"),MEDIUM_VALUE("medium_value","> 200 & < 500"),LOW_VALUE("low_value","< 200");

    private String type;

    private String outputmsg;

    Category(String type, String outputmsg) {
        this.type = type;
        this.outputmsg = outputmsg;
    }

    public String getType() {
        return type;
    }

    public String getOutputmsg() {
        return outputmsg;
    }
}
