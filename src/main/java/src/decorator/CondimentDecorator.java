package src.decorator;

/**
 * CondimentDecorator
 */
public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();

}