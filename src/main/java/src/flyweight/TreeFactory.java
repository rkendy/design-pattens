package src.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name);
            treeTypes.put(name, result);
        }
        return result;
    }

}