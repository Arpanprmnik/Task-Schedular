package tasks;


public class Task{
    int id;
    String title,description,deadline;
    Boolean done;
    int priority;
    public Task(int id, String title, String description, int priority, String deadline){
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = false;
        this.priority = priority;
        this.deadline = deadline;
    }
    public void displayTask(){
        System.out.println("Task ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Status: " + done);
        System.out.println("Priority: " + priority);
        System.out.println("Deadline: " + deadline);
    }
    public void editTask(String title, String description, int priority, String deadline){
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
    }
    public void markAsDone(){
        this.done = true;
    }
    public void removeTask(int id){
        // remove task from the list
        this.id = 0;
    }
}