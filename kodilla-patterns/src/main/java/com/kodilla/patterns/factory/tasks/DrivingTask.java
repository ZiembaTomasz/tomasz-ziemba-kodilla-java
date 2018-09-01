package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
        Task shopping = factory.makeTask(TaskFactory.DRIVING);
        if(taskName == shopping.getTaskName()){
            return true;
        }
        else{
            return false;
        }
    }
}
