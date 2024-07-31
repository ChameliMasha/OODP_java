package decorator;

public class FillColour extends DecorateShape {
    public FillColour(Shape decorateShape) {
        super(decorateShape);
    }

    @Override
    public String drawShape() {
        return decorateShape.drawShape() + ", Fill with a colour";
    }
}