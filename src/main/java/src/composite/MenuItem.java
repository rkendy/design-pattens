package src.composite;

public class MenuItem extends MenuComponent {
    String name;
    boolean vegetarian;
    double price;

    public MenuItem(String name, boolean vegetarian, double price) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.print(" " + name);
        if (vegetarian) {
            System.out.print("(v)");
        }
        System.out.print(", " + price);
        System.out.println();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

}