package src.factorymethod.client.nystyle;

import src.factorymethod.client.nystyle.product.*;
import src.factorymethod.creator.PizzaStore;
import src.factorymethod.product.Pizza;

/**
 * NYStylePizzaStore
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }
        if (type.equals("clam")) {
            return new NYStyleClamPizza();
        }
        if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }

        return null;
    }
}