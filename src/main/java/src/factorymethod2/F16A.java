package src.factorymethod2;

public class F16A extends F16 {

    @Override
    protected F16 makeF16() {
        super.makeF16();
        engine = "F16A Engine";
        return this;
    }
}
