package src.iterator.cafe;

import java.util.Collection;

import src.iterator.Iterator;
import src.iterator.MenuItem;

public class CafeMenuIterator implements Iterator {

    java.util.Iterator<MenuItem> menuItemsIterator;

    public CafeMenuIterator(Collection<MenuItem> menuItems) {
        this.menuItemsIterator = menuItems.iterator();
    }

    @Override
    public boolean hasNext() {
        return menuItemsIterator.hasNext();
    }

    @Override
    public MenuItem next() {
        return menuItemsIterator.next();
    }

}