package src.visitor.visitor;

import src.visitor.shapes.Circle;
import src.visitor.shapes.CompoundShape;
import src.visitor.shapes.Dot;
import src.visitor.shapes.Rectangle;
import src.visitor.shapes.Shape;

public class XMLExportVisitor implements Visitor {

    public String export(Shape shape) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        sb.append(shape.accept(this)).append("\n");
        return sb.toString();
    }

    @Override
    public String visitDot(Dot d) {
        String content = "<dot>\n\t<id>%d</id>\n\t<x>%d</x>\n\t<y>%d</y>\n</dot>";
        return String.format(content, d.getId(), d.getX(), d.getY());
    }

    @Override
    public String visitCircle(Circle c) {
        String content = "<circle>\n\t<id>%d</id>\n\t<x>%d</x>\n\t<y>%d</y>\n\t<radius>%d</radius>\n</circle>";
        return String.format(content, c.getId(), c.getX(), c.getY(), c.getRadius());
    }

    @Override
    public String visitRectangle(Rectangle r) {
        String content = "<rectangle>\n\t<id>%d</id>\n\t<x>%d</x>\n\t<y>%d</y>\n\t<width>%d</width>\n\t<height>%d</height>\n</rectangle>";
        return String.format(content, r.getId(), r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public String visitCompoundGraphic(CompoundShape cg) {
        return "<compound_graphic>\n\t<id>" + cg.getId() + "</id>" + "\n" //
                + _visitCompoundGraphic(cg) + "</compound_graphic>";
    }

    private String _visitCompoundGraphic(CompoundShape cg) {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : cg.children) {
            String obj = shape.accept(this);
            obj = "\t" + obj.replace("\n", "\n\t") + "\n";
            sb.append(obj);
        }
        return sb.toString();
    }

}