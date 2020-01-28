package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.Circle;
import com.kodilla.testing2.config.Shape;
import com.kodilla.testing2.config.ShapeCollector;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeTest {
    @Test
    public void addFiguresTest(){
        Circle circle = new Circle(5, "Circle1");
        ArrayList<Shape> test = new ArrayList<Shape>();
        ShapeCollector shapeCollector = new ShapeCollector(test);
        shapeCollector.addFigure(circle);
        Assert.assertEquals("Circle1", shapeCollector.getFigures(0).getShapeName());


    }
    @Test
    public void removeFigureTest(){

    }
    @Test
    public void getFiguresTest(){

    }
    @Test
    public void showFiguresTest(){

    }
}
