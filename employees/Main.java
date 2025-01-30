package employees;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create Manager and Developer objects
        Manager manager = new Manager("John", "Doe", "Male", 45, 5000.00, 2000.00);
        Developer developer = new Developer("Jane", "Smith", "Female", 30, 4000.00, 50.00, 20);

        // Print calculateSalary() and toString() results
        System.out.println(manager.toString());
        System.out.println("Manager Salary: " + manager.calculateSalary());

        System.out.println(developer.toString());
        System.out.println("Developer Salary: " + developer.calculateSalary());
    }
}
