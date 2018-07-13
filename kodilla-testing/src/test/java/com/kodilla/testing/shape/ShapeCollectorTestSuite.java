package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite
{
    @Test
    public void testAddFigure()
    {
        ShapeCollector shapeCollector = new ShapeCollector(Circle);
        shapeCollector.addFigure(Circle);
        Assert.assertEquals(1, shapeCollector.addFigure());

    }
    @Test
    public void testRemoveFigure()
    {
        ShapeCollector shapeCollector = new ShapeCollector(Circle);
        shapeCollector.addFigure(Circle);
        shapeCollector.removeFigure(0);
        Assert.assertEquals(0, shapeCollector.removeFigure())
    }
    @Test
    public void testGetFigure()
    {
        ShapeCollector shapeCollector = new ShapeCollector(Circle);
        shapeCollector.addFigure(Circle);
        shapeCollector.getFigure();
        Assert.assertEquals("Circle", shapeCollector.getFigure())
    }
    @Test
    public void testShowFigures()
    {
        ShapeCollector shapeCollector = new ShapeCollector(Circle);
        shapeCollector.addFigure(Circle);
        shapeCollector.addFigure(Triangle);

    }




}
