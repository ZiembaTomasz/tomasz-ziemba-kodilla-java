package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector
{
    private ArrayList<Shape> list = new ArrayList<>();

    public void addFigure(Shape shape)
    {
        list.add(shape);
    }

    public void removeFigure(Shape shape)
    {
        if(list.contains(shape))
        {
            list.remove(shape);
        }
        list.size();
    }

    public Shape getFigure(int n)
    {
        return list.get(n);
    }

    public void showFigures()
    {

        System.out.println(list);
    }
}
