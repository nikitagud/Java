package employees;

class Developer extends Employee {
    private double baseSalary;
    private double overtimeRate;
    private int overtimeHours;

    // Parametrized constructor
    public Developer(String firstName, String lastName, String gender, int age, double baseSalary, double overtimeRate, int overtimeHours) {
        super(firstName, lastName, gender, age);
        this.baseSalary = baseSalary;
        this.overtimeRate = overtimeRate;
        this.overtimeHours = overtimeHours;
    }

    // Getter methods
    public double getBaseSalary() {
        return baseSalary;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    // Implement calculateSalary() method
    @Override
    public double calculateSalary() {
        return baseSalary + (overtimeRate * overtimeHours);
    }

    // Override toString method
    @Override
    public String toString() {
        return "Developer [firstName=" + getFirstName() + ", lastName=" + getLastName() + ", gender=" + getGender() +
                ", age=" + getAge() + ", baseSalary=" + baseSalary + ", overtimeRate=" + overtimeRate +
                ", overtimeHours=" + overtimeHours + "]";
    }
}
