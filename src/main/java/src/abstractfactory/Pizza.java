package src.abstractfactory;

import src.abstractfactory.ingredient.cheese.Cheese;
import src.abstractfactory.ingredient.clam.Clam;
import src.abstractfactory.ingredient.dough.Dough;
import src.abstractfactory.ingredient.pepperoni.Pepperoni;
import src.abstractfactory.ingredient.sauce.Sauce;
import src.abstractfactory.ingredient.veggies.Veggies;

/**
 * Pizza
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    abstract public void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}