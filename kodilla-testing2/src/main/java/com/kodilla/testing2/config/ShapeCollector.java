package com.kodilla.testing2.config;

import java.util.ArrayList;

public class ShapeCollector {
    Shape shape;
    private ArrayList<Shape> list = new ArrayList<>();

    public ShapeCollector(ArrayList<Shape> list) {
        this.list = list;
    }

    public void addFigure(Shape shape){
        list.add(shape);

    }
    public void removeFigure(Shape shape){

    }
    public Shape getFigures(int n){
        return list.get(n);

    }
    public void showFigures(){

    }
}
