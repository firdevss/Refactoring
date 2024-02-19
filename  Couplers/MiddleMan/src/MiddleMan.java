public class MiddleMan {
    private FinalDestination finalDestination;

    public MiddleMan() {
        this.finalDestination = new FinalDestination();
    }

    // Delegating method
    public void doSomething() {
        finalDestination.doSomething();
    }
}
