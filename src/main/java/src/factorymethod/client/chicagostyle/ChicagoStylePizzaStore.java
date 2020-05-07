package src.factorymethod.client.chicagostyle;

import src.factorymethod.client.chicagostyle.product.*;
import src.factorymethod.creator.PizzaStore;
import src.factorymethod.product.Pizza;

/**
 * NYStylePizzaStore
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        if (type.equals("veggie"))
            return new ChicagoStyleVeggiePizza();
        if (type.equals("clam"))
            return new ChicagoStyleClamPizza();
        if (type.equals("pepperoni"))
            return new ChicagoStylePepperoniPizza();
        return null;
    }
}