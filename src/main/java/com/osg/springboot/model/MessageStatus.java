package com.osg.springboot.model;

public enum MessageStatus {
    PENDING("Pending"),
    SEND("Send"),
    FAILED("Failed");

    private String value;

    MessageStatus(String value) {
        this.value = value;
    }

    String getValue() {
        return this.value;
    }
}
