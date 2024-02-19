public class LoggerRefactored implements Loggable{
    @Override
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
