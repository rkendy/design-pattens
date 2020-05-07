package src.decorator.condiment;

import src.decorator.Beverage;
import src.decorator.CondimentDecorator;

/**
 * Soy
 */
public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }

}