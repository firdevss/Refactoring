/*
* Refused Bequest occurs when a subclass inherits from a superclass but only needs a subset of the inherited methods or attributes, leading to inappropriate or unnecessary inheritance.
 *We have a superclass Vehicle with common behaviors like start() and stop().
The Car class extends Vehicle and adds its specific behavior drive().
The Bicycle class also extends Vehicle but does not add any specific behavior.
*
* Solution to Refused Bequest:

To resolve the Refused Bequest, we should favor composition over inheritance. Rather than inheriting from a superclass when it's not suitable, we can create a separate class and delegate behavior as needed.
*
*
* In this refactored version, we've extracted the common behavior (start() and stop()) into a separate Engine class, and Vehicle class now delegates these behaviors to an instance of Engine. This way, both Car and Bicycle classes only inherit what they need, adhering to the principle of composition over inheritance.
*
*
*  */

public class Main {

    public static void main(String[] args) {
        /*Car car = new Car();
        car.start();
        car.drive();
        car.stop();

        System.out.println();

        Bicycle bicycle = new Bicycle();
        bicycle.start();
        // bicycle does not have a drive() method
        bicycle.stop();
       */
        System.out.println("RefactoringVersion");


            Car car = new Car();
            car.start();
            car.drive();
            car.stop();

            System.out.println();

            Bicycle bicycle = new Bicycle();
            bicycle.start();
            bicycle.stop();

}}