package org.example;

import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;
import org.example.entity.TaskData;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------***    ANN     ***-----------");

        Set<Task> annsTasks = new HashSet<>();
        Task annsTask1 = new Task("OOP Project","JAVA - OOP Practice","Ann", Status.IN_PROGRESS, Priority.MED);
        Task annsTask2 = new Task("Front-End Project","React JS Project","Ann", Status.IN_QUEUE, Priority.LOW);

        annsTasks.add(annsTask1);
        annsTasks.add(annsTask2);



        System.out.println("-----------***    BOB     ***-----------");

        Set<Task> bobsTasks = new HashSet<>();
        Task bobsTask1 = new Task("OOP Project","JAVA - OOP Practice","Bob", Status.IN_PROGRESS, Priority.MED);
        Task bobsTask2 = new Task("Front-End Project","React JS Project","Bob", Status.IN_QUEUE, Priority.LOW);

        bobsTasks.add(bobsTask1);
        bobsTasks.add(bobsTask2);




        System.out.println("-----------***    CAROL     ***-----------");
        Set<Task> carolsTasks = new HashSet<>();
        Task carolsTask1 = new Task("OOP Project","JAVA - OOP Practice","Carol", Status.IN_PROGRESS, Priority.MED);
        Task carolsTask2 = new Task("Front-End Project","React JS Project","Carol", Status.IN_QUEUE, Priority.LOW);

        carolsTasks.add(carolsTask1);
        carolsTasks.add(carolsTask2);
        System.out.println("-----------***    UNASSIGNED     ***-----------");

        Set<Task> unassignedTasks = new HashSet<>();
        Task unassignedTask = new Task("JS Project","JS Practice",null, Status.IN_PROGRESS, Priority.MED);
        unassignedTasks.add(unassignedTask);

        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);

        System.out.println(taskData.getTasks("Ann"));
        System.out.println(taskData.getTasks("Bob"));
        System.out.println(taskData.getTasks("Carol"));
        System.out.println("HER BİR ÇALIŞANIN ÜZERİNDEKİ UNIQUE OLMAYAN TASKLAR" + taskData.getTasks("all"));


        System.out.println("Herhangi bir çalışana atanmamış task:" + taskData.getDifferences(unassignedTasks, taskData.getTasks("ann")));

        System.out.println("BİRDEN FAZLA ÇALIŞANA ATANMIŞ TASK VARMI ? (KESİŞİM) ");
        System.out.println("------------- KESİŞİM 1-------------------");
        System.out.println(taskData.getIntersection(annsTasks,bobsTasks));
        System.out.println("------------- KESİŞİM 2 -------------------");
        System.out.println(taskData.getIntersection(annsTasks,carolsTasks));
        System.out.println("-------------KESİŞİM 3-------------------");
        System.out.println(taskData.getIntersection(bobsTasks,carolsTasks));


    }
}