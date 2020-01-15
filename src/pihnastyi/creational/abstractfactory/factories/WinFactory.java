package pihnastyi.creational.abstractfactory.factories;

import pihnastyi.creational.abstractfactory.objects.button.Button;
import pihnastyi.creational.abstractfactory.objects.button.WinButton;
import pihnastyi.creational.abstractfactory.objects.checkbox.CheckBox;
import pihnastyi.creational.abstractfactory.objects.checkbox.WinCheckBox;
import pihnastyi.creational.abstractfactory.objects.customobject.CustomObject;
import pihnastyi.creational.abstractfactory.objects.customobject.WinCustomObject;

public class WinFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }

    @Override
    public CustomObject createCustomObject() {
        return new WinCustomObject();
    }
}
