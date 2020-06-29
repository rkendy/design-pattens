package src.state;

public class GumballMachineClient {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(1);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }

}