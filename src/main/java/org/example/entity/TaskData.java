package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
private Set<Task> annsTasks;
private Set<Task> bobsTasks;
private Set<Task> carolTasks;
private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolTasks = carolTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name){
    if(name.equals("ann")){
        return annsTasks;
    } else if (name.equals("bobs")) {
        return bobsTasks;
    } else if (name.equals("carol")){
        return carolTasks;
    } else
        return unassignedTasks;
    }
}
