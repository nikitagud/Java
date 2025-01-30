package cars;

public class Main {
    public static void main(String[] args) {
        Vehicle bmw = new BMW();
        Vehicle mercedes = new Mercedes();
        Vehicle audi = new Audi();

        // გამოსაკრავები
        bmw.startEngine();
        bmw.stopEngine();
        System.out.println(bmw.describePackage());

        mercedes.startEngine();
        mercedes.stopEngine();
        System.out.println(mercedes.describePackage());

        audi.startEngine();
        audi.stopEngine();
        System.out.println(audi.describePackage());
    }
}
