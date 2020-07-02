package src.state.states;

import src.state.State;
import src.state.GumBallState;

public class HasQuarterState extends State {

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        setState(GumBallState.NO_QUARTER);
    }

    @Override
    public void turnCrank() {
        releaseBall();
        if (getCount() > 0) {
            setState(GumBallState.NO_QUARTER);
        } else {
            setState(GumBallState.SOLD_OUT);
        }
    }

}