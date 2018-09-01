package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        if(taskName == shopping.getTaskName() ){
            return true;
        }
        else{
            return false;
        }
    }
}
