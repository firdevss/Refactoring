public class VehicleRefactoringVersion {
    private  EngineRefactoringVersion engine;

    public VehicleRefactoringVersion() {
        this.engine = new EngineRefactoringVersion();
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }
}
