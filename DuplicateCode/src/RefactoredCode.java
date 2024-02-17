/*
* In the refactored code, the duplication has been eliminated by consolidating the calculation of rectangle and square areas into a single method (calculateRectangleOrSquareArea). This reduces redundancy, improves maintainability, and makes the code easier to understand. Additionally, comments explaining each method's purpose can further enhance readability and clarity.
*
*
* */

public class RefactoredCode {
    // Method to calculate the area of a rectangle or square
    public double calculateRectangleOrSquareArea(double side1, double side2) {
        return side1 * side2;
    }

    // Method to calculate the area of a circle
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;}

}
