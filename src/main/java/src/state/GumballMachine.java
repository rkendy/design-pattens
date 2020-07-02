package src.state;

import java.util.EnumMap;

public class GumballMachine {

    State state;
    int count = 0;
    EnumMap<GumBallState, State> map = new EnumMap<>((GumBallState.class));

    GumballMachine(int numberOfGumballs) {
        map.put(GumBallState.SOLD_OUT, GumBallState.SOLD_OUT.getImpl().register(this));
        map.put(GumBallState.NO_QUARTER, GumBallState.NO_QUARTER.getImpl().register(this));
        map.put(GumBallState.HAS_QUARTER, GumBallState.HAS_QUARTER.getImpl().register(this));

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