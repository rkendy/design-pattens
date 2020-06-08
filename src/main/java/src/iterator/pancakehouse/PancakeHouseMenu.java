package src.iterator.pancakehouse;

import java.util.ArrayList;
import java.util.List;

import src.iterator.Iterator;
import src.iterator.Menu;
import src.iterator.MenuItem;

public class PancakeHouseMenu implements Menu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("K&B's Pancake Breakfast", true, 2.99));
        menuItems.add(new MenuItem("Regular Pancake Breakfast", false, 2.99));
        menuItems.add(new MenuItem("Waffles", true, 3.59));
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    @Override
    public String getName() {
        return "Pancake Menu";
    }

}