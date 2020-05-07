package src.templatemethod;

public class Coffee extends CaffeineBeverage {

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    // Overriding the hook:
    @Override
    public boolean customerWantsCondiments() {
        boolean isToAddCondiments = readUserInput();
        return isToAddCondiments;
    }

    private boolean readUserInput() {
        // Read user input:
        return true;
    }

}