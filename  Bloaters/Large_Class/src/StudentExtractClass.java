/*

In this refactored version:

The CourseEnrollment class is extracted to manage course-related functionalities.
Student class now has a courseEnrollment field instead of managing courses directly.
This separation adheres to the Single Responsibility Principle, making the codebase more modular and easier to maintain.
By extracting the course management functionality into a separate class, we've improved the organization and maintainability of the code. Additionally, it allows for better encapsulation and separation of concerns.
 */

public class StudentExtractClass
{
    private String name;
    private int age;
    private String address;
    private CourseEnrollment courseEnrollment;

    // Constructor, getters, and setters

    public void displayInfo() {
        // Display student information
    }

    // Other methods related to student management
}

class CourseEnrollment {
    private List<Course> courses;

    public CourseEnrollment() {
        this.courses = new ArrayList<>();
    }

    public double calculateGPA() {
        // Calculate GPA based on course grades
    }

    public void enrollCourse(Course course) {
        // Enroll the student in a course
    }


}
