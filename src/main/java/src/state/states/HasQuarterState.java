package src.state.states;

import src.state.State;
import src.state.GumballMachine;

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
        gumballMachine.setState(GumballMachine.StateEnum.NO_QUARTER);
    }

    @Override
    public void turnCrank() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(GumballMachine.StateEnum.NO_QUARTER);
        } else {
            System.out.println("Oops, out of gumballs");
            gumballMachine.setState(GumballMachine.StateEnum.SOLD_OUT);
        }
    }

}