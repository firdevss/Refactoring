public class PersonRefactored {
    public double calculateSalary(RefactoredSalaryCalculationContext context) {
        double baseSalary = context.getHoursWorked() * context.getHourlyRate();
        if (context.isManager()) {
            baseSalary *= 1.5; // Managers get 50% bonus
        }
        if (context.isHasOvertime()) {
            baseSalary += 100; // Overtime bonus
        }
        if (context.getAge() > 60) {
            baseSalary += 200; // Seniority bonus
        }
        return baseSalary;
    }



}
