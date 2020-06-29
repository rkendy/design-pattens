package src.state;

import java.util.HashMap;
import java.util.Map;

import src.state.states.HasQuarterState;
import src.state.states.NoQuarterState;
import src.state.states.SoldOutState;

public class GumballMachine {

    public static enum StateEnum {
        SOLD_OUT, NO_QUARTER, HAS_QUARTER
    };

    State state;
    int count = 0;
    Map<StateEnum, State> map;

    GumballMachine(int numberOfGumballs) {
        map = new HashMap<>();
        map.put(StateEnum.SOLD_OUT, new SoldOutState(this));
        map.put(StateEnum.NO_QUARTER, new NoQuarterState(this));
        map.put(StateEnum.HAS_QUARTER, new HasQuarterState(this));
        // map.put(StateEnum.SOLD, new SoldState(this));

        this.count = numberOfGumballs;
        if (numberOfGumballs > 0) {
            setState(StateEnum.NO_QUARTER);
        } else {
            setState(StateEnum.SOLD_OUT);
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

    public void setState(StateEnum state) {
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