package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks = new HashSet<>();
    private Set<Task> bobsTasks = new HashSet<>();
    private Set<Task> carolsTasks = new HashSet<>();
    private Set<Task> unassignedTasks = new HashSet<>();

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        if (name.equals("ann")) {
            return annsTasks;
        } else if (name.equals("bob")) {
            return bobsTasks;
        } else if (name.equals("carol")) {
            return carolsTasks;
        }
        return unassignedTasks;
    }
    public Set<Task> getUnion(Set<Task> task1,Set<Task> task2 ){
        Set<Task> taskCopy = new HashSet<>(task1);
        taskCopy.addAll(task2);
        return  taskCopy;
    }
    public Set<Task> getIntersection(Set<Task> task1,Set<Task> task2 ){
        Set<Task> taskCopy = new HashSet<>(task1);
        taskCopy.retainAll(task2);
        return  taskCopy;
    }

    public Set<Task> getDifferences(Set<Task> task1, Set<Task> task2){
        Set<Task> taskCopy = new HashSet<>(task1);
        taskCopy.removeAll(task2);
        return taskCopy;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }
}
