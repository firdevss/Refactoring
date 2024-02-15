public class Person {
    public double calculateSalary(int age, int hoursWorked, double hourlyRate, boolean isManager, boolean hasOvertime) {
        double baseSalary = hoursWorked * hourlyRate;
        if (isManager) {
            baseSalary *= 1.5; // Managers get 50% bonus
        }
        if (hasOvertime) {
            baseSalary += 100; // Overtime bonus
        }
        if (age > 60) {
            baseSalary += 200; // Seniority bonus
        }
        return baseSalary;
    }

}
