public class ClassBAdapter implements CommonInterface {

    private ClassB classB;

    public ClassBAdapter(ClassB classB) {
        this.classB = classB;
    }

    @Override
    public void performOperation(int data) {
        // No implementation needed for this method in ClassB
    }

    @Override
    public void executeOperation(String input) {
        classB.executeOperationB(input);
    }
}
