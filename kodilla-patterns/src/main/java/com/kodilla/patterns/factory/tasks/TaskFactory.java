package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch(taskClass){
            case SHOPPING:
                return new ShoppingTask("Electronic Device", "Playstation 4",350.25);
            case PAINTING:
                return new PaintingTask("Kitchen's walls", "white", "walls");
            case DRIVING:
                return new DrivingTask("Stones Stuff", "Brooklyn", "Heavy truck");
            default:
                return null;

        }
    }
}
