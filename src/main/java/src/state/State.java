package src.state;

abstract public class State {
    protected GumballMachine gumballMachine;

    public State(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    abstract public void insertQuarter();

    abstract public void ejectQuarter();

    abstract public void turnCrank();

}