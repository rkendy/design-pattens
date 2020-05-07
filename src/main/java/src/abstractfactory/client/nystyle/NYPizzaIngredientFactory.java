package src.abstractfactory.client.nystyle;

import src.abstractfactory.PizzaIngredientFactory;
import src.abstractfactory.ingredient.cheese.Cheese;
import src.abstractfactory.ingredient.cheese.MozzarellaCheese;
import src.abstractfactory.ingredient.clam.Clam;
import src.abstractfactory.ingredient.clam.FreshClam;
import src.abstractfactory.ingredient.dough.Dough;
import src.abstractfactory.ingredient.dough.ThinCrustDough;
import src.abstractfactory.ingredient.pepperoni.Pepperoni;
import src.abstractfactory.ingredient.sauce.MarinaraSauce;
import src.abstractfactory.ingredient.sauce.Sauce;
import src.abstractfactory.ingredient.veggies.Veggies;

/**
 * NYPizzaIngredientFactory
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
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
        return new FreshClam();
    }

}