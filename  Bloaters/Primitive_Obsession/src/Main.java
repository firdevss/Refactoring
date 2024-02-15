/*Primitive Obsession is a code smell or anti-pattern where
 primitive data types are excessively used to represent domain
 concepts instead of creating dedicated classes or types for them.
  It occurs when developers use basic data types (such as integers, strings, or booleans)
  to represent domain-specific concepts that could benefit from encapsulation and abstraction.
 */



/* let's refactor a simple example to demonstrate how to replace primitive types with custom objects in a runnable Java code snippet.

Let's consider a scenario where we have a Car class that represents cars in a car rental system. Initially, it might have attributes such as make, model, year, rentalPrice, etc., all of which are primitive data types.

We'll refactor this to use custom objects for Make, Model, Year, and Price. Let's create those classes
*/
public class Main {
    public static void main(String[] args) {
        Make make = new Make("Toyota");
        Model model = new Model("Auris");
        Year year = new Year(2016);
        Price rentalPrice = new Price(50.0);

        CarRefactoredPrimitiveObsessin car = new CarRefactoredPrimitiveObsessin(make, model, year, rentalPrice);

        System.out.println(car);


        System.out.println("Hello world!");
    }
}