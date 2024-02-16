/*
* e have a scenario where we need to calculate the area of different shapes such as circles, rectangles, and triangles. Instead of using a switch statement to determine the type of shape and calculate its area, we can use polymorphism to create a Shape interface and concrete classes for each type of shape.
*
*we define a Shape interface with a method calculateArea(). Then, we create concrete classes Circle, Rectangle, and Triangle implementing this interface. Each concrete class provides its own implementation of the calculateArea() method.

By using polymorphism, we can treat all shapes uniformly through the Shape interface. This approach avoids the scattered use of switch statements and makes the code more maintainable and extensible. If we need to add a new shape, we can simply create a new class implementing the Shape interface without modifying existing code.
*
*
*
* */

public class Main {
    public static void main(String[] args) {
        // Create instances of different shapes
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 8);

        // Calculate and print areas
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}