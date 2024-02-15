/*

Refactoring a large class into smaller, more manageable classes can improve code organization, maintainability, and readability. One common technique for refactoring is Extract Class, where you identify cohesive groups of fields and methods within the large class and move them into separate classes.

Let's illustrate this with an example:

Problem: Large Class
Consider a Student class that manages various aspects of a student, including their personal information and academic records:
 */
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String address;
    private List<Course> courses;

    // Constructor, getters, and setters

    public double calculateGPA() {
        // Calculate GPA based on course grades
        return 0;
    }

    public void enrollCourse(Course course) {
        // Enroll the student in a course
    }

    public void displayInfo() {
        // Display student information
    }

    // Other methods related to student management






}
