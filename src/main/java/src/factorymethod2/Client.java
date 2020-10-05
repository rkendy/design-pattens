package src.factorymethod2;

public class Client {

    public static void main(String[] args) {
        F16 f16A = new F16A();
        F16 f16B = new F16B();

        f16A.fly();
        f16B.fly();
    }
}
