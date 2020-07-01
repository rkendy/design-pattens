package src.state.states;

import src.state.GumballMachine;
import src.state.State;
import src.state.GumBallState;

public class HasQuarterState extends State {

    public HasQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(GumBallState.NO_QUARTER);
    }

    @Override
    public void turnCrank() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(GumBallState.NO_QUARTER);
        } else {
            gumballMachine.setState(GumBallState.SOLD_OUT);
        }
    }

}