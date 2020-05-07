package src.abstractfactory.client.nystyle;

import src.abstractfactory.Pizza;
import src.abstractfactory.PizzaIngredientFactory;
import src.abstractfactory.PizzaStore;
import src.abstractfactory.pizza.*;

/**
 * NYStylePizzaStore
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY style cheese pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY style veggie pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY style clam pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NY style pepperoni pizza");
        }

        return pizza;
    }
}