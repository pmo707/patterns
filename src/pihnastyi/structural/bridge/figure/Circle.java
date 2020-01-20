package pihnastyi.structural.bridge.figure;

import pihnastyi.structural.bridge.color.Color;

public class Circle extends Figure {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void printInfoAboutFigure() {
        System.out.println("this is circle");
        color.getColor();
    }
}
