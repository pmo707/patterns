package pihnastyi.structural.bridge.figure;

import pihnastyi.structural.bridge.color.Color;

public class Triangle extends Figure {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void printInfoAboutFigure() {
        System.out.println("this is triangle");
        color.getColor();
    }
}
