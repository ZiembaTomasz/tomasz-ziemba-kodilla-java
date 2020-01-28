package com.kodilla.testing2.config;

public class Triangle implements Shape {
    int field;
    String shapeName;

    public Triangle(int field, String shapeName) {
        this.field = field;
        this.shapeName = shapeName;
    }

    public int getField() {
        return field;
    }

    public String getShapeName() {
        return shapeName;
    }
}
