package src.abstractfactory2;

public class Client {
    public static void main(String[] args) {
        F16Factory f16Factory = new F16Factory();
        Boeing747Factory boeing747Factory = new Boeing747Factory();

        Aircraft aircraft = new Aircraft(f16Factory);
        aircraft.fly();

        aircraft = new Aircraft(boeing747Factory);
        aircraft.fly();

    }
}
