package src.iterator.diner;

import src.iterator.Iterator;
import src.iterator.Menu;
import src.iterator.MenuItem;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 5;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        menuItems[numberOfItems++] = new MenuItem("Vegetarian BLT", true, 2.99);
        menuItems[numberOfItems++] = new MenuItem("BLT", false, 3.99);
        menuItems[numberOfItems++] = new MenuItem("Soup of the day", true, 1.99);
        menuItems[numberOfItems++] = new MenuItem("Hotdog", false, 3.59);
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    @Override
    public String getName() {
        return "Diner Menu";
    }

}