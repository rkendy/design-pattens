package src.abstractfactory;

import src.abstractfactory.ingredient.cheese.Cheese;
import src.abstractfactory.ingredient.clam.Clam;
import src.abstractfactory.ingredient.dough.Dough;
import src.abstractfactory.ingredient.pepperoni.Pepperoni;
import src.abstractfactory.ingredient.sauce.Sauce;
import src.abstractfactory.ingredient.veggies.Veggies;

/**
 * PizzaIngredientFactory
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clam createClam();
}