package src.iterator.cafe;

import java.util.HashMap;
import java.util.Map;

import src.iterator.Iterator;
import src.iterator.Menu;
import src.iterator.MenuItem;

public class CafeMenu implements Menu {

    Map<Integer, MenuItem> map;
    int key;

    public CafeMenu() {
        map = new HashMap<>();
        key = 0;
        map.put(key++, new MenuItem("Cappuccino", true, 1.99));
        map.put(key++, new MenuItem("Americano", true, 0.99));
        map.put(key++, new MenuItem("Espresso", true, 2.99));
        map.put(key++, new MenuItem("Macchiato", true, 3.99));
    }

    @Override
    public Iterator createIterator() {
        return new CafeMenuIterator(map.values());
    }

    @Override
    public String getName() {
        return "Cafe Menu";
    }

}