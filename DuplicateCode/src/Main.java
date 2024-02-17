/*
* Code duplication can arise from various situations, including collaboration among multiple programmers, lack of awareness about existing code, subtle similarities in functionality, or even due to time pressure and laziness. However, code duplication often leads to maintenance challenges, increased risk of bugs, and reduced readability. It's crucial to identify and address code duplication to maintain a healthy and sustainable codebase.
*
*
* */


public class Main {
    public static void main(String[] args) {

        OriginalCode code = new OriginalCode();

        // Calculate and print areas wiht Original Code
       /*
        System.out.println("Rectangle Area: " + code.calculateRectangleArea(5, 4));
        System.out.println("Square Area: " + code.calculateSquareArea(5));
        System.out.println("Circle Area: " + code.calculateCircleArea(5));
        */

        // Calculate and print areas with Refactored Code
        System.out.println("Rectangle Area: " + code.calculateRectangleArea(5, 4));
        System.out.println("Square Area: " + code.calculateSquareArea( 5));
        System.out.println("Circle Area: " + code.calculateCircleArea(5));



    }
}