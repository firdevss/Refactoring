/*
* he concept of using comments to mask poorly written code, along with a refactored version without the need for excessive comments
*
*n the refactored version, unnecessary comments that simply describe what the code is doing have been removed. The code itself is now more concise and self-explanatory, making the comments redundant. This makes the code cleaner and easier to read without sacrificing clarity.
* */


public class Main {
    public static void main(String[] args) {

        CommentedCode code = new CommentedCode();
        // Calculate the sum of 5 and 7
        int result = code.calculateSum(5, 7);
        // Print the result
        System.out.println("Sum: " + result);
        // Check if 6 is even
        boolean isEven = code.isEven(6);
        // Print the result
        System.out.println("Is 6 even? " + isEven);


        ImprovedCode ImprovedCode = new ImprovedCode();
         result = ImprovedCode.calculateSum(5, 7);
        System.out.println("Sum: " + result);
         isEven = ImprovedCode.isEven(6);
        System.out.println("Is 6 even? " + isEven);





    }
}