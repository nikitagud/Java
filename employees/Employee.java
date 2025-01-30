package employees;

// Employee Class
abstract class Employee {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    // Parametrized constructor
    public Employee(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Override toString method
    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", age=" + age + "]";
    }
}
