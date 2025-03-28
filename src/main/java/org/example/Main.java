package org.example;

import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


    Task ann = new Task("deneme1", "deneme1", "ann",Status.ASSIGNED , Priority.HIGH );
    Task bob = new Task("deneme2", "deneme2", "bob", Status.ASSIGNED , Priority.HIGH );

    Set<Task> tasks = new HashSet<>();

    }

}