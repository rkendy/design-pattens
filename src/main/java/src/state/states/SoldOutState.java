package src.state.states;

import src.state.GumballMachine;
import src.state.State;

public class SoldOutState extends State {

    public SoldOutState(final GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("Can't accept quarter since there are no gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There is no quarter to eject");
    }

    @Override
    public void turnCrank() {
        System.out.println("Quarter not inserted, and no gumballs available");
    }

}