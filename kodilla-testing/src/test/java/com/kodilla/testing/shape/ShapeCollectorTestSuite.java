package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure() {
        Circle circle = new Circle("Circle 1", 40);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        Assert.assertEquals("Circle 1", shapeCollector.getFigure(0).getShapeName());
    }
    @Test
    public void testRemoveFigure() {
        Circle circle = new Circle("Circle 1", 40);
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(circle);
        shapeCollector.removeFigure(circle);
        Assert.assertEquals(0, shapeCollector.showFigures().size());

    }
    @Test
    public void testGetFigure() {
        Circle circle = new Circle("Circle 1", 40);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        Assert.assertEquals("Circle 1", shapeCollector.getFigure(0).getShapeName());
        Assert.assertEquals(40, shapeCollector.getFigure(0).getField());
    }
    @Test
    public void testShowFigures() {
        Circle circle = new Circle("Circle 1", 40);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        ArrayList<Shape> shapes = shapeCollector.showFigures();
        Assert.assertEquals(1, shapeCollector.showFigures().size());
    }
}
