package pihnastyi.structural.bridge;

import pihnastyi.structural.bridge.color.Black;
import pihnastyi.structural.bridge.figure.Circle;
import pihnastyi.structural.bridge.figure.Figure;

public class Demo {

    public static void main(String[] args) {
        Figure circleBlack = new Circle(new Black());
        circleBlack.printInfoAboutFigure();
    }
}
