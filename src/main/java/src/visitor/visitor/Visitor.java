package src.visitor.visitor;

import src.visitor.shapes.Circle;
import src.visitor.shapes.CompoundShape;
import src.visitor.shapes.Dot;
import src.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}