package src.factorymethod.creator;

import src.factorymethod.product.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // Abstract Factory Method:
    protected abstract Pizza createPizza(String type);
}