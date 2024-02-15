public class RefactoredSalaryCalculationContext {

    private int age;
    private int hoursWorked;
    private double hourlyRate;
    private boolean isManager;
    private boolean hasOvertime;

    public RefactoredSalaryCalculationContext(int age, int hoursWorked, double hourlyRate, boolean isManager, boolean hasOvertime) {
        this.age = age;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.isManager = isManager;
        this.hasOvertime = hasOvertime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public boolean isHasOvertime() {
        return hasOvertime;
    }

    public void setHasOvertime(boolean hasOvertime) {
        this.hasOvertime = hasOvertime;
    }
}
