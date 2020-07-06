package src.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = createNewCircle();
        shapes.add(circle);
        shapes.add(circle.clone());

        Rectangle rectangle = createNewRectangle();
        shapes.add(rectangle);
        shapes.add(rectangle.clone());

        cloneAndCompare(shapes, shapesCopy);
    }

    private static Circle createNewCircle() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 30;
        circle.color = "Blue";
        return circle;
    }

    private static Rectangle createNewRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.x = 11;
        rectangle.y = 12;
        rectangle.width = 20;
        rectangle.height = 30;
        rectangle.color = "Green";
        return rectangle;
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println("[OK] " + i + ": shapes are different objects!");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println("[OK] " + i + ": shapes are identical!");
                } else {
                    System.out.println("[ERROR] " + i + ": shapes are not identical!");
                }
            } else {
                System.out.println("[ERROR] " + i + ": shapes objects are the same");
            }
        }
    }

}