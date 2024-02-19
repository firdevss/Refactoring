public class TaskExecutorRefactored {
    private Loggable logger;

    public TaskExecutorRefactored(Loggable logger) {
        this.logger = logger;
    }

    public void executeTask(Runnable task) {
        logger.log("Executing task...");
        task.run();
        logger.log("Task executed successfully.");
    }
}
