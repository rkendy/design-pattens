package src.flyweight;

public class Client {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(0, 0, "Summer Oak");
        forest.plantTree(10, 20, "Summer Oak");
        forest.plantTree(10, 40, "Summer Oak");
        forest.plantTree(10, 0, "Autumn Oak");
        forest.plantTree(20, 10, "Autumn Oak");
        forest.plantTree(40, 30, "Autumn Oak");
        // and many others....

        forest.paint();
    }

}