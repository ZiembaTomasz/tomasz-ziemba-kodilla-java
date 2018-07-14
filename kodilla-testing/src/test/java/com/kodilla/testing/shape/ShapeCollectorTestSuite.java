package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite
{
    @Test
    public void testAddFigure()
    {
        Circle circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        Assert.assertEquals(circle, shapeCollector.addFigure(1));

    }
    @Test
    public void testRemoveFigure()
    {
        ShapeCollector shapeCollector = new ShapeCollector(Circle);
        shapeCollector.addFigure(Circle);
        shapeCollector.removeFigure(0);
        Assert.assertEquals(0, shapeCollector.removeFigure());
    }
    @Test
    public void testGetFigure()
    {
        ShapeCollector shapeCollector = new ShapeCollector(Circle);
        shapeCollector.addFigure(Circle);
        shapeCollector.getFigure();
        Assert.assertEquals("Circle", shapeCollector.getFigure());
    }
    @Test
    public void testShowFigures()
    {
        ShapeCollector shapeCollector = new ShapeCollector(Circle);
        shapeCollector.addFigure(Circle);
        shapeCollector.addFigure(Triangle);
        shapeCollector.showFigures();
        Assert.assertEquals("Circle, Triangle", shapeCollector.showFigures());



    }




}
