/*
* In the original code, there's duplication in the calculation of area formulas (calculateRectangleArea, calculateSquareArea, and calculateCircleArea). These methods perform similar calculations but are implemented separately
*
*
* */

public class OriginalCode {


    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a square
    public double calculateSquareArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a circle
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        OriginalCode code = new OriginalCode();

        // Calculate and print areas
        System.out.println("Rectangle Area: " + code.calculateRectangleArea(5, 4));
        System.out.println("Square Area: " + code.calculateSquareArea(5));
        System.out.println("Circle Area: " + code.calculateCircleArea(5));
    }

}
