package src.factorymethod.client.californiastyle;

import src.factorymethod.creator.PizzaStore;
import src.factorymethod.product.Pizza;
import src.factorymethod.client.californiastyle.product.*;

/**
 * NYStylePizzaStore
 */
public class CaliforniaStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new CaliforniaStyleCheesePizza();
        if (type.equals("veggie"))
            return new CaliforniaStyleVeggiePizza();
        if (type.equals("clam"))
            return new CaliforniaStyleClamPizza();
        if (type.equals("pepperoni"))
            return new CaliforniaStylePepperoniPizza();
        return null;
    }
}