package src.state.states;

import src.state.State;
import src.state.GumBallState;

public class NoQuarterState extends State {

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        setState(GumBallState.HAS_QUARTER);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

}