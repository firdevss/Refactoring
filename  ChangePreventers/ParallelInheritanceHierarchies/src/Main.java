/*
Refactoring parallel inheritance hierarchies involves consolidating related classes from separate hierarchies into a single hierarchy. Let's consider a scenario where we have two parallel inheritance hierarchies: one for different types of vehicles (Vehicle hierarchy) and another for different types of engines (Engine hierarchy). We'll refactor this code by merging these two hierarchies into a single hierarchy where each vehicle has an engine.

 e've merged the parallel inheritance hierarchies of Vehicle and Engine into a single hierarchy. Each vehicle now contains an engine, and the code is structured in a way that adheres to the Single Responsibility Principle. This makes the code easier to maintain and extend.

 */

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", new PetrolEngine());
        Vehicle motorcycle = new Motorcycle("Honda", new GasolineEngine());

        System.out.println("Car:");
        car.displayInfo();
        car.start();
        car.stop();

        System.out.println("\nMotorcycle:");
        motorcycle.displayInfo();
        motorcycle.start();
        motorcycle.stop();



    }
}