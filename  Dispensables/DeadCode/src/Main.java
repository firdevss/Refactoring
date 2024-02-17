/*
Dead code refers to code that is no longer used and serves no purpose in the application. It can clutter the codebase and make it harder to understand and maintain. Refactoring dead code involves identifying and removing such code to improve the clarity and maintainability of the codebase.
 */

public class Main {
    public static void main(String[] args) {
        StringUtilsReversed reversed=new StringUtilsReversed();
        System.out.println("Reverse: " + reversed.reverse("Hello"));
        System.out.println("To Upper Case: " + reversed.toUpperCase("hello"));
        System.out.println("To Lower Case: " + reversed.toLowerCase("HELLO"));




        System.out.println("Hello world!");
    }
}