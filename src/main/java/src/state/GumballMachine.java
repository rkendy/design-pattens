package src.state;

import java.util.HashMap;
import java.util.Map;

import src.state.states.HasQuarterState;
import src.state.states.NoQuarterState;
import src.state.states.SoldOutState;

public class GumballMachine {

    State state;
    int count = 0;
    Map<GumBallState, State> map;

    GumballMachine(int numberOfGumballs) {
        map = new HashMap<>();
        map.put(GumBallState.SOLD_OUT, new SoldOutState(this));
        map.put(GumBallState.NO_QUARTER, new NoQuarterState(this));
        map.put(GumBallState.HAS_QUARTER, new HasQuarterState(this));

        this.count = numberOfGumballs;
        if (numberOfGumballs > 0) {
            setState(GumBallState.NO_QUARTER);
        } else {
            setState(GumBallState.SOLD_OUT);
        }
    }

    public void insertQuarter() {
        System.out.println("[Gumball Machine]: Trying to insert a quarter...");
        state.insertQuarter();
    }

    public void ejectQuarter() {
        System.out.println("[Gumball Machine]: Trying to eject a quarter...");
        state.ejectQuarter();
    }

    public void turnCrank() {
        System.out.println("[Gumball Machine]: Trying to turn crank ...");
        state.turnCrank();
    }

    public void setState(GumBallState state) {
        this.state = map.get(state);
    }

    public void releaseBall() {
        System.out.println("[Gumball Machine]: A gumball comes rolling out the slot...");
        if (count > 0) {
            count -= 1;
        }
    }

    public int getCount() {
        return count;
    }

}