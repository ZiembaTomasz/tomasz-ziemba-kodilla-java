package com.kodilla.patterns2.observer.homework;

public class Menthor implements Check {
    private final String name;
    private  int updateCount;


    public Menthor(String name){
        this.name = name;
    }
    @Override
    public void update(Queue queue) {
        System.out.println(name + " You have new task in queue " + queue.getName() + " total " +
                queue.getTasks().size() + " The tasks: " + queue.getTasks());
        updateCount++;
    }
    public String getName() {
        return name;
    }
    public int getUpdateCount() {
        return updateCount;
    }
}
