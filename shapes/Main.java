package shapes;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape cylinder = new Cylinder(5.0, 10.0);
        Shape cone = new Cone(5.0, 10.0);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Cylinder Surface Area: " + cylinder.calculateArea());
        System.out.println("Cone Surface Area: " + cone.calculateArea());
    }
}
