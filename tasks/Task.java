package tasks;

import java.time.LocalDateTime;

public class Task{
    int id;
    String title;
    String description;
    String category;
    String status;
    int priority;
    LocalDateTime deadline;
    public Task(int id, String title, String description, String category, String status, int priority, LocalDateTime deadline){
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.status = status;
        this.priority = priority;
        this.deadline = deadline;
    }
    public void displayTask(){
        System.out.println("Task ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
        System.out.println("Status: " + status);
        System.out.println("Priority: " + priority);
        System.out.println("Deadline: " + deadline);
    }
    public void editTask(String title, String description, String category, String status, int priority, LocalDateTime deadline){
        this.title = title;
        this.description = description;
        this.category = category;
        this.status = status;
        this.priority = priority;
        this.deadline = deadline;
    }
    public void markAsDone(){
        this.status = "Done";
    }
    public void removeTask(int id){
        // remove task from the list
        this.id = 0;
    }
}