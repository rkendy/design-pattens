package src.prototype;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object) {
        if (object instanceof Shape) {
            Shape shape = (Shape) object;
            return shape.x == this.x && shape.y == this.y && Objects.equals(shape.color, this.color);
        }
        return false;
    }

}