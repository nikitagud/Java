package employees;

// Manager Class (Inheriting Employee)
class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    // Parametrized constructor
    public Manager(String firstName, String lastName, String gender, int age, double baseSalary, double bonus) {
        super(firstName, lastName, gender, age);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Getter methods
    public double getBaseSalary() {
        return baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    // Implement calculateSalary() method
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Manager [firstName=" + getFirstName() + ", lastName=" + getLastName() + ", gender=" + getGender() +
                ", age=" + getAge() + ", baseSalary=" + baseSalary + ", bonus=" + bonus + "]";
    }
}
