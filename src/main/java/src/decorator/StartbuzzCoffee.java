package src.decorator;

import src.decorator.beverage.DarkRoast;
import src.decorator.beverage.Expresso;
import src.decorator.beverage.HouseBlend;
import src.decorator.condiment.Mocha;
import src.decorator.condiment.Soy;

/**
 * StartbuzzCoffee
 */
public class StartbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}