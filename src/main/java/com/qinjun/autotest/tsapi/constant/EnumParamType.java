package com.qinjun.autotest.tsapi.constant;

public enum EnumParamType {
    OBJECT("object"),
    ARRAY("array"),
    INT("int"),
    LONG("long"),
    FLOAT("float"),
    DOUBLE("double"),
    STRING("string"),
    BOOLEAN("boolean");

    private EnumParamType(String type) {
        this.type=type;
    }
    public String getType() {return type;}
    private String type;

}
