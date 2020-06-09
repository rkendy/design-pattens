package src.iterator;

import java.util.ArrayList;
import java.util.List;

import src.iterator.cafe.CafeMenu;
import src.iterator.diner.DinerMenu;
import src.iterator.pancakehouse.PancakeHouseMenu;

// Client
public class Waitress {
    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        for (Menu menu : menus) {
            printMenu(menu);
        }
    }

    private void printMenu(Menu menu) {
        System.out.println("=======>>> " + menu.getName() + ":");
        Iterator iterator = menu.createIterator();
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.print(item.name + ", ");
            System.out.print(item.vegetarian + ", ");
            System.out.println(item.price);
        }
    }

    public static void main(String[] args) {
        List<Menu> menus = new ArrayList<>();
        menus.add(new PancakeHouseMenu());
        menus.add(new DinerMenu());
        menus.add(new CafeMenu());
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }

}