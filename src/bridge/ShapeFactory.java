package bridge;

import javafx.scene.shape.Circle;

import java.util.concurrent.Callable;

public class ShapeFactory {

    public ShapeFactory shapeFactory;

    public ShapeFactory() {    }

    public Shape createShape(ShapeEnum shapeEnum, ColorEnum colorEnum){
        Color color = createColor(colorEnum);
        switch (shapeEnum){
            //case CIRCLE: return new Circle(color);
            case SQUARE: return new Square(color);
            default:
                throw new IllegalStateException("unexpected value:" + shapeEnum);

        }
    }
    private Color createColor(ColorEnum colorEnum){
        switch (colorEnum){
            case RED: return new Red();
            case BLUE: return new Blue();
            default:
                throw new IllegalStateException("unexpected value:" + colorEnum);
        }
    }
}
