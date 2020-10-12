package src.abstractfactory2;

public class Aircraft {
    IEngine engine;
    ICockpit cockpit;
    IWings wings;
    IAircraftFactory factory;

    public Aircraft(IAircraftFactory factory) {
        this.factory = factory;
    }

    public void fly() {
        engine = factory.createEngine();
        cockpit = factory.createCockpit();
        wings = factory.createWings();
        System.out.println("Flyging with: ");
        System.out.println("\tEngine: " + engine.type());
        System.out.println("\tCockpit: " + cockpit.type());
        System.out.println("\tWings: " + wings.type());
    }
}
