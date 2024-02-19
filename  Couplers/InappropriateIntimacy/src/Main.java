/*
inappropriate intimacy refers to a code smell where two classes are too tightly coupled, often accessing each other's internal details excessively. Refactoring such code involves restructuring it to reduce this intimacy and improve modularity and maintainability. Let's consider a simple example
 */

public class Main {
    public static void main(String[] args) {

        // Create a Logger instance
        Loggable logger = new Logger();

        // Create a TaskExecutor instance with the logger
        TaskExecutor taskExecutor = new TaskExecutor(logger);

        // Define a task using a lambda expression
        Runnable task = () -> {
            // Perform some task
            System.out.println("Task is being executed...");
        };

        // Execute the task using the TaskExecutor
        taskExecutor.executeTask(task);

        System.out.println("Hello world!");
    }
}