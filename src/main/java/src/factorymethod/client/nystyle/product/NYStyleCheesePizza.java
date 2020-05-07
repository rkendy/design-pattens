package src.factorymethod.client.nystyle.product;

import src.factorymethod.product.Pizza;

/**
 * NYStyleCheesePizza
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Granted Reggiano Cheese");
    }
}