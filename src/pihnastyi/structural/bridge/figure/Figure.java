package pihnastyi.structural.bridge.figure;

import pihnastyi.structural.bridge.color.Color;

public abstract class Figure {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract void printInfoAboutFigure();
}
