package shapes;

public class Cone implements Shape {
    private double radius;
    private double height;
    private static final double PI = 3.14159; // Constant for Pi

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return PI * radius * (radius + slantHeight);
    }
}
