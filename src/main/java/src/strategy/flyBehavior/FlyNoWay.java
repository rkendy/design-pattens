package src.strategy.flyBehavior;

import src.strategy.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Not flying");
    }

}