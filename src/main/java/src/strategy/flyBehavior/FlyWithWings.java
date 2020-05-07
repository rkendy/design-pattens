package src.strategy.flyBehavior;

import src.strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying");
    }

}