package com.kodilla.patterns.factory.tasks;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask(){
        TaskFactory factory = new TaskFactory();

        Task shopping = factory.makeTask(TaskFactory.SHOPPING);

        Assert.assertEquals("Electronic Device", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }
    @Test
    public void testPaintingTask(){
        TaskFactory factory = new TaskFactory();

        Task painting = factory.makeTask(TaskFactory.PAINTING);

        Assert.assertEquals("Kitchen's walls", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testDrivingTask(){
        TaskFactory factory = new TaskFactory();

        Task driving = factory.makeTask(TaskFactory.DRIVING);

        Assert.assertEquals("Stones Stuff", driving.getTaskName());
        Assert.assertNotEquals(false, driving.isTaskExecuted());
    }
}
