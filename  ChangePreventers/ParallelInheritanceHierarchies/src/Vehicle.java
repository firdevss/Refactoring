abstract class Vehicle {
    protected String make;
    protected Engine engine;

    public Vehicle(String make, Engine engine) {
        this.make = make;
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public abstract void displayInfo();


}
