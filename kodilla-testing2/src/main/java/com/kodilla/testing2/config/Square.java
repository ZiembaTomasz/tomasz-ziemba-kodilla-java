package com.kodilla.testing2.config;

public class Square implements Shape {
    int field;
    String shapeName;

    public Square(int field, String shapeName) {
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
