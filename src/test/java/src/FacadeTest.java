package src;

import src.facade.HomeTheatherFacade;

public class FacadeTest {
    public static void main(String[] args) {
        HomeTheatherFacade facade = new HomeTheatherFacade();
        System.out.println("Watch movie:");
        facade.watchMovie();
        System.out.println("==========================\n");
        System.out.println("End watch movie:");
        facade.endMovie();
    }

}