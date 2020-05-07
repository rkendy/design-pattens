package src;

import src.templatemethod.Coffee;
import src.templatemethod.Tea;

public class TemplateMethodTest {
    public static void main(String[] args) {
        System.out.println("My Tea:");
        Tea mytTea = new Tea();
        mytTea.prepareRecipe();
        System.out.println("========================");
        System.out.println("My Coffee:");
        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();
    }
}