package src.visitor.shapes;

import java.util.ArrayList;
import java.util.List;

import src.visitor.visitor.Visitor;

public class CompoundShape implements Shape {
    public int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    @Override
    public void draw() {
    }

    @Override
    public void move(int x, int y) {
    }

    public int getId() {
        return id;
    }

    public void add(Shape shape) {
        children.add(shape);
    }

}