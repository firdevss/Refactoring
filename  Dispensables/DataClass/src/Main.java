/*
 "Data Class" is a class that mainly holds data without much behavior. Refactoring such classes involves encapsulating behavior within the class to make it more useful and robust
*To refactor this data class, we can introduce behavior that operates on the data it holds. Let's say we want to add a method to check if the person is eligible to vote
*In this refactoring, the Person class has been enhanced to encapsulate behavior along with data, making it more useful and following the principle of object-oriented design.
*
* */





public class Main {
    public static void main(String[] args) {

        // Creating a person object
        PersonRefactored personRefactored = new PersonRefactored("Alice", 25);

        // Using getters to access data
        System.out.println("Name: " + personRefactored.getName());
        System.out.println("Age: " + personRefactored.getAge());

        // Using the new behavior to check eligibility to vote
        if (personRefactored.isEligibleToVote()) {
            System.out.println(personRefactored.getName() + " is eligible to vote.");
        } else {
            System.out.println(personRefactored.getName() + " is not eligible to vote.");
        }



    }
}