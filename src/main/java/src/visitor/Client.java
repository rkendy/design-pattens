package src.visitor;

import src.visitor.shapes.Circle;
import src.visitor.shapes.CompoundShape;
import src.visitor.shapes.Dot;
import src.visitor.shapes.Rectangle;
import src.visitor.shapes.Shape;
import src.visitor.visitor.XMLExportVisitor;

public class Client {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(compoundShape);

    }

    private static void export(Shape shape) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shape));
    }
}