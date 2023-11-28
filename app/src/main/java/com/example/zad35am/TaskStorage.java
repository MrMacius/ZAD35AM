package com.example.zad35am;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();
    private final List<Task> tasks;
    private TaskStorage(){

        int taskCount = 150;

        tasks = new ArrayList<Task>(taskCount);

        for(int i = 1; i <= taskCount; i++){
            Task task = new Task();
            task.setName("PILNE ZADANIE NR"+i);
            task.setDone(i%3==0);
            tasks.add(task);
            if(i%3 == 0){
                task.setCategory(Category.STUDIES);
            }else{
                task.setCategory(Category.HOME);
            }
        }

    }

    public static TaskStorage getInstance(){
        return taskStorage;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public List<Task> getTasks(){
        return tasks;
    }

    public Task getTask(UUID uuid){
        for(Task task : tasks){
            if(task.getId().equals(uuid))
                return task;
        }
        return null;
    }



}
