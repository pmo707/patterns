package pihnastyi.structural.bridge.figure;

import pihnastyi.structural.bridge.color.Color;

public class Square extends Figure {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void printInfoAboutFigure() {
        System.out.println("this is square");
        color.getColor();
    }
}
