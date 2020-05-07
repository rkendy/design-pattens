package src.abstractfactory.client.chicagostyle;

import src.abstractfactory.PizzaIngredientFactory;
import src.abstractfactory.ingredient.cheese.Cheese;
import src.abstractfactory.ingredient.cheese.ReggianoCheese;
import src.abstractfactory.ingredient.clam.Clam;
import src.abstractfactory.ingredient.clam.FrozenClam;
import src.abstractfactory.ingredient.dough.Dough;
import src.abstractfactory.ingredient.dough.ThickCrustDough;
import src.abstractfactory.ingredient.pepperoni.Pepperoni;
import src.abstractfactory.ingredient.sauce.PlumTomatoSauce;
import src.abstractfactory.ingredient.sauce.Sauce;
import src.abstractfactory.ingredient.veggies.Veggies;

/**
 * NYPizzaIngredientFactory
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pepperoni createPepperoni() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }

}