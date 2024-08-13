

import tasks.Task;

public class Main {
    public static void main(String[] args){
        Task task1 = new Task(1, "Task 1", "Description 1", 1,"2024-12-31");
        Task task2 = new Task(2, "Task 2", "Description 2", 1,"2024-12-31");
        task1.displayTask();
        task2.displayTask();
        task1.editTask("Task 1", "Description changed", 1,"2024-12-31");
        
        task1.displayTask();
    }
}