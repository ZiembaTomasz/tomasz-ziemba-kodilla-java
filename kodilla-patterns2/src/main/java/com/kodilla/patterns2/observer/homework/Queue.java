package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Queue implements Checkable {
    private final List<Check>checks;
    private final List<String>tasks;
    private final String name;

    public Queue(String name) {
        checks = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }
    public void addTask(String task){
        tasks.add(task);
        notifyMe();
    }
    @Override
    public void register(Check check){
        checks.add(check);
    }
    @Override
    public void notifyMe(){
        for(Check check : checks){
            check.update(this);
        }
    }

    public List<Check> getChecks() {
        return checks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
