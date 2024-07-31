package decorator;

public class DrawBorder extends DecorateShape {

    public DrawBorder(Shape decorateShape) {
        super(decorateShape);
    }

    @Override
    public String drawShape() {
        return decorateShape.drawShape() + ", Draw a border";
    }
}