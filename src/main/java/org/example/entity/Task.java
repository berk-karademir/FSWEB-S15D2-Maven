package org.example.entity;

import java.util.Objects;

public class Task {

    private String project;
    private String description;
    private String assignee;
    private Status status;
    private Priority priority;


    public Task(String project, String description, String assignee, Status status, Priority priority) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.status = status;
        this.priority = priority;
    }

    public String getProject() {
        return project;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    // uniqueness of Task Class


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Task task)) return false;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }

    @Override
    public String toString() {
        return "\n"+
                getAssignee() + "'s" + " task's" + "\n" +
                "Project: " + project + "\n" +
                "Descripton: " + description + "\n" +
                "Status: " + status + "\n" +
                "Priority: " + priority + "\n---------------------------------------";


    }
}
