package operations;

// OperationImpl.java
public class OperationImpl implements Operation {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int difference(int a, int b) {
        return a - b;
    }

    @Override
    public int product(int a, int b) {
        return a * b;
    }

    @Override
    public int quotient(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
