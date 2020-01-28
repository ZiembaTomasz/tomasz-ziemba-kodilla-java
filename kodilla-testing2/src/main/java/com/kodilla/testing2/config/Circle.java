package com.kodilla.testing2.config;

public class Circle implements Shape {
    int field;
    String shapeName;

    public Circle(int field, String shapeName) {
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
