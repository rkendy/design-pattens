package src.factorymethod2;

public class F16B extends F16 {
    @Override
    protected F16 makeF16() {
        super.makeF16();
        engine = "F16B Engine";
        return this;
    }
}
