public class Car extends Vehicle{
    public Car(String make, Engine engine) {
        super(make, engine);
    }

    @Override
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Vehicle Type: Car");
    }
}
