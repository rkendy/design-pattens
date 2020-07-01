package src.state.states;

import src.state.GumballMachine;
import src.state.State;
import src.state.GumBallState;

public class NoQuarterState extends State {

    public NoQuarterState(final GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(GumBallState.HAS_QUARTER);
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