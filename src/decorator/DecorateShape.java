package decorator;

public abstract class DecorateShape implements Shape{
    protected Shape decorateShape;

    public DecorateShape(Shape decoratShape) {
        this.decorateShape = decoratShape;
    }

    @Override
    public String drawShape() {
        return decorateShape.drawShape();
    }
}
