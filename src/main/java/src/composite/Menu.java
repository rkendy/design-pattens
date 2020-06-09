package src.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.print("\n------ " + name);
        System.out.println(" ------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

}