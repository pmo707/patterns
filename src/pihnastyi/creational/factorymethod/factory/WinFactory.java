package pihnastyi.creational.factorymethod.factory;

import pihnastyi.creational.factorymethod.buttons.Button;
import pihnastyi.creational.factorymethod.buttons.WinButton;

public class WinFactory implements Factory {
    @Override
    public Button createButton() {
        return new WinButton();
    }
}
