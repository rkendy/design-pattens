package src.factorymethod2;

public class F16 {
    String engine;
    Integer cockpit;

    protected F16 makeF16() {
        engine = "Default Engine";
        cockpit = 10;
        return this;
    }

    public void fly() {
        F16 f16 = makeF16();
        System.out.println("F16 with engine " + engine + " is flying");
    }
}
