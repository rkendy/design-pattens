package src.iterator.pancakehouse;

import java.util.List;

import src.iterator.Iterator;
import src.iterator.MenuItem;

public class PancakeHouseMenuIterator implements Iterator {

    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }

}