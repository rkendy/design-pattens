package src;

import src.adapter.round.RoundHole;
import src.adapter.round.RoundPeg;
import src.adapter.round.SquarePegAdapter;
import src.adapter.square.SquarePeg;
import src.strategy.Duck;
import src.strategy.FlyBehavior;
import src.strategy.QuackBehavior;
import src.strategy.ducks.DecoyDuck;
import src.strategy.ducks.MallardDuck;
import src.strategy.ducks.RubberDuck;
import src.strategy.flyBehavior.FlyNoWay;
import src.strategy.flyBehavior.FlyWithWings;
import src.strategy.quackBehavior.MuteQuack;
import src.strategy.quackBehavior.Quack;
import src.strategy.quackBehavior.Squeak;

public class StrategyTest {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());
        System.out.println("Mallard Duck:");
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehavior(new FlyNoWay());
        rubberDuck.setQuackBehavior(new Squeak());
        System.out.println("Rubber Duck:");
        rubberDuck.performFly();
        rubberDuck.performQuack();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.setFlyBehavior(new FlyNoWay());
        decoyDuck.setQuackBehavior(new MuteQuack());
        System.out.println("Decoy Duck:");
        decoyDuck.performFly();
        decoyDuck.performQuack();

        decoyDuck.setFlyBehavior(() -> {
            System.out.println("Dynamic behavior!!!!");
        });
        decoyDuck.performFly();
    }
}