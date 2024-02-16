public class Motorcycle extends Vehicle{
    public Motorcycle(String make, Engine engine) {
        super(make, engine);
    }

    @Override
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Vehicle Type: Motorcycle");
    }
}
