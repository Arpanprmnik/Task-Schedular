
import java.time.LocalDateTime;

import tasks.Task;

public class Main {
    public static void main(String[] args){
        Task task1 = new Task(1, "Task 1", "Description 1", "Category 1", "Pending", 1, LocalDateTime.parse("2021-12-31T23:59:59"));
        Task task2 = new Task(1, "Task 2", "Description 2", "Category 2", "Pending", 1, LocalDateTime.parse("2021-12-30T23:59:59"));
        task1.displayTask();
        task2.displayTask();
        task1.editTask("Task 1", "Description 1", "Category 1", "Done", 1, LocalDateTime.parse("2021-12-31T23:59:59"));
        
        task1.displayTask();
    }
}