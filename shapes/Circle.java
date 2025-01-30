package shapes;

public class Circle implements Shape {
    private double radius;
    private static final double PI = 3.14159; // Constant for Pi

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
}
