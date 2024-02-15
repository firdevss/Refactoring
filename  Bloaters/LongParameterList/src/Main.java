/*
Refactoring Long Parameter List is a technique used to simplify function or method calls by encapsulating multiple parameters into a single object or by introducing parameter objects. This helps improve readability, maintainability, and extensibility of code. Let's refactor a simple example demonstrating this technique in Java:

Suppose we have a Person class with a method calculateSalary that takes several parameters such as int age, int hoursWorked, double hourlyRate, boolean isManager, boolean hasOvertime, etc.
This method call becomes cumbersome and error-prone when the number of parameters increases. To refactor this, we can encapsulate related parameters into a single object. Let's create a

update the Person class to use SalaryCalculationContext instead of individual parameters

e can create an instance of SalaryCalculationContext and pass it to the calculateSalary method:
 */


public class Main {
    public static void main(String[] args) {

        RefactoredSalaryCalculationContext context = new RefactoredSalaryCalculationContext(35, 160, 25.0, true, false);
         PersonRefactored person = new PersonRefactored();
        double salary = person.calculateSalary(context);
        System.out.println("Salary: " + salary);


    }
}