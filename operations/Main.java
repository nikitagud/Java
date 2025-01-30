package operations;

// Main.java
public class Main {
    public static void main(String[] args) {
        Operation operation = new OperationImpl();

        int a = 10, b = 5;

        System.out.println("Sum: " + operation.sum(a, b));
        System.out.println("Difference: " + operation.difference(a, b));
        System.out.println("Product: " + operation.product(a, b));
        System.out.println("Quotient: " + operation.quotient(a, b));
    }
}
