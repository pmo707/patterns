package pihnastyi.creational.abstractfactory.factories;

import pihnastyi.creational.abstractfactory.objects.button.Button;
import pihnastyi.creational.abstractfactory.objects.button.MacButton;
import pihnastyi.creational.abstractfactory.objects.checkbox.CheckBox;
import pihnastyi.creational.abstractfactory.objects.checkbox.MacCheckBox;
import pihnastyi.creational.abstractfactory.objects.customobject.CustomObject;
import pihnastyi.creational.abstractfactory.objects.customobject.MacCustomObject;

public class MacFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

    @Override
    public CustomObject createCustomObject() {
        return new MacCustomObject();
    }
}
