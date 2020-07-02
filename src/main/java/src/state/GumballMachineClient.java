package src.state;

public class GumballMachineClient {
    public static void main(final String[] args) {
        final GumballMachine gumballMachine = new GumballMachine(1);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

    }

}