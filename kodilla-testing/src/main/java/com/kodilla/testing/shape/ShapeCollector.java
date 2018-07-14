package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector
{
    private ArrayList<Shape> list = new ArrayList<>();


    public void addFigure(Shape shape)
    {
        ShapeCollector figure = new ShapeCollector(shape);
        list.add(figure);

    }
    public void removeFigure(Shape shape)
    {


    }
    public Shape getFigure(int n)
    {
        return null;
    }
    public void showFigures()
    {

    }

}
