package decorator;

public class Main {
    public static void main(String[] args){

        //plain circle
        Shape shape = new Circle();
        System.out.println("Description:" + shape.drawShape());

        //circle woith border
        Shape circleBorder = new DrawBorder(new Circle());
        System.out.println("Description of the circle with boarder :" + circleBorder.drawShape());

        //circle with border and fill colour
        Shape circleBorderFill = new FillColour(new DrawBorder(new Circle()));
        System.out.println("circle with border and fill colour:" + circleBorderFill.drawShape());


    }
}
