package shapes;

public class Cylinder implements Shape {
    private double radius;
    private double height;
    private static final double PI = 3.14159; // Constant for Pi

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2 * PI * radius * (radius + height);
    }
}
