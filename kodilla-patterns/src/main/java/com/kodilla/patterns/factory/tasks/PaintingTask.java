package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask(){
        System.out.println("Task in progress...");
    }
    @Override
    public String getTaskName(){
        return taskName;
    }
    @Override
    public boolean isTaskExecuted() {
        TaskFactory factory = new TaskFactory();
        Task shopping = factory.makeTask(TaskFactory.PAINTING);
        if(taskName == shopping.getTaskName() ){
            return true;
        }
        else{
            return false;
        }
    }
}
