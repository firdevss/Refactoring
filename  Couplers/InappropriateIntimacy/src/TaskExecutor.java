public class TaskExecutor {
    private Logger logger;

    public TaskExecutor(Logger logger) {
        this.logger = logger;
    }

    public void executeTask(Runnable task) {
        logger.log("Executing task...");
        task.run();
        logger.log("Task executed successfully.");
    }
}
