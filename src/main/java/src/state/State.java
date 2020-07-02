package src.state;

abstract public class State {

    private GumballMachine gumballMachine;

    protected State register(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        return this;
    }

    protected void setState(GumBallState state) {
        this.gumballMachine.setState(state);
    }

    protected void releaseBall() {
        gumballMachine.releaseBall();
    }

    protected int getCount() {
        return gumballMachine.getCount();
    }

    abstract public void insertQuarter();

    abstract public void ejectQuarter();

    abstract public void turnCrank();

}