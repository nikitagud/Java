package cars;

public class VehicleImpl implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    @Override
    public String describePackage() {
        // ამ მეთოდს ვერ გადაფარავს შვილობილი კლასი
        throw new UnsupportedOperationException("describePackage method not implemented in VehicleImpl");
    }
}
