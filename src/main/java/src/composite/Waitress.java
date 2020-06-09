package src.composite;

public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu");
        MenuComponent dinerMenu = new Menu("Diner Menu");
        MenuComponent dessertMenu = new Menu("Dessert Menu");
        MenuComponent cafeMenu = new Menu("Cafe Menu");

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", true, 3.89));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Waffles", true, 3.59));

        dessertMenu.add(new MenuItem("Apple Pie", true, 1.59));
        dessertMenu.add(new MenuItem("Brownies", true, 1.05));
        dessertMenu.add(new MenuItem("Strawberry Cake", true, 2.99));

        cafeMenu.add(new MenuItem("Cappuccino", true, 1.99));
        cafeMenu.add(new MenuItem("Americano", true, 0.99));
        cafeMenu.add(new MenuItem("Espresso", true, 2.99));

        dinerMenu.add(new MenuItem("Vegetarian BLT", true, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day", true, 1.99));
        dinerMenu.add(new MenuItem("Hotdog", false, 3.59));
        dinerMenu.add(dessertMenu);

        MenuComponent allMenus = new Menu("All Menus");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }

}