public class ClassAAdapter implements CommonInterface{

    private ClassA classA;

    public ClassAAdapter(ClassA classA) {
        this.classA = classA;
    }

    @Override
    public void performOperation(int data) {
        classA.performOperationA(data);
    }

    @Override
    public void executeOperation(String input) {
        // No implementation needed for this method in ClassA
    }

}
