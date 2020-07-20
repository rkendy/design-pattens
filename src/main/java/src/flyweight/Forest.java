package src.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name) {
        // Reuse TreeType. Save Memory.
        TreeType type = TreeFactory.getTreeType(name);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void paint() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}