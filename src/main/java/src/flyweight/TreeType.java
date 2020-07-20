package src.flyweight;

public class TreeType {
    private String name;
    // Other big size types here...

    public TreeType(String name) {
        this.name = name;
    }

    public void draw(int x, int y) {
        System.out.println("Draw a " + name + " at " + x + "," + y);
    }
}