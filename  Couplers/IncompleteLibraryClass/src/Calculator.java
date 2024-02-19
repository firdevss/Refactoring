public class Calculator {
    public int calculate(Operation operation, int a, int b) {
        return operation.perform(a, b);
    }
}
