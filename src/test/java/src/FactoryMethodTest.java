package src;

import org.junit.Test;

import src.factorymethod.client.chicagostyle.ChicagoStylePizzaStore;
import src.factorymethod.client.nystyle.NYStylePizzaStore;
import src.factorymethod.creator.PizzaStore;
import src.factorymethod.product.Pizza;

/**
 * PizzaTestDrive
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        new FactoryMethodTest().shouldOrderNYStyleCheesePizza();
        new FactoryMethodTest().shouldOrderChicagoStyleCheesePizza();
    }

    public void shouldOrderNYStyleCheesePizza() {
        PizzaStore nyStore = new NYStylePizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName() + "\n");
    }

    public void shouldOrderChicagoStyleCheesePizza() {
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        Pizza pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName() + "\n");
    }
}