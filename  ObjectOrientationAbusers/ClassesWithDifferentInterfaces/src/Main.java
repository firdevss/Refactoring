/*
*  refactoring classes to have a common interface. We'll create two classes with similar functionality but different method names and signatures, and then refactor them to have a common interface.
*
* n this example, we have ClassA and ClassB, each with different method names and signatures. We create an interface CommonInterface with methods that represent a common denominator between the two classes. Then, we create adapter classes ClassAAdapter and ClassBAdapter to adapt ClassA and ClassB to the CommonInterface. Finally, in the main method, we demonstrate how to use objects of ClassA and ClassB through their respective adapters. This approach allows us to treat both classes uniformly despite their initial differences.
*
* */

public class Main {
    public static void main(String[] args) {

        // Using ClassA
        ClassA classA = new ClassA();
        CommonInterface classAAdapter = new ClassAAdapter(classA);
        classAAdapter.performOperation(10); // Method with common name
        classAAdapter.executeOperation("Hello"); // Method with no equivalent in ClassA

        // Using ClassB
        ClassB classB = new ClassB();
        CommonInterface classBAdapter = new ClassBAdapter(classB);
        classBAdapter.performOperation(20); // Method with no equivalent in ClassB
        classBAdapter.executeOperation("World"); // Method with common name


    }
}