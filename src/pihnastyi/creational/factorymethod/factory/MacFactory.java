package pihnastyi.creational.factorymethod.factory;

import pihnastyi.creational.factorymethod.buttons.Button;
import pihnastyi.creational.factorymethod.buttons.MacButton;

public class MacFactory implements Factory {

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
