package src.iterator.diner;

import src.iterator.Iterator;
import src.iterator.MenuItem;

public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return (position < items.length && items[position] != null);
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position++];
        return menuItem;
    }

}