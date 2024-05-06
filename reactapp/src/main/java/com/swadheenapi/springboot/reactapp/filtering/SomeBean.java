package com.swadheenapi.springboot.reactapp.filtering;

public class SomeBean {
    private String field1;
    private String field2;
    private String field3;

    public SomeBean(String field1, String field3, String field2) {
        this.field1 = field1;
        this.field3 = field3;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                '}';
    }
}
