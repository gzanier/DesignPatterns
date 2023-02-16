package bridge;

public class Main {
    public static void main(String[] args) {
        //Shape blueCircle = new Square(new Blue());


        ShapeFactory shapeFactory = new ShapeFactory(); // ShapeFactory.getInstance()
        ShapeEnum shapeEnum = ShapeEnum.SQUARE;
        ColorEnum colorEnum = ColorEnum.RED;
        Shape shape = shapeFactory.createShape(shapeEnum, colorEnum);
        System.out.println(shape.getClass()+"-"+ shape.getColor().getClass());
    }
}
