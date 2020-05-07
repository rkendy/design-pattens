package src.templatemethod;

public class Tea extends CaffeineBeverage {

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

}