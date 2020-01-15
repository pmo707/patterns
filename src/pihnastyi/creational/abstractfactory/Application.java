package pihnastyi.creational.abstractfactory;

import pihnastyi.creational.abstractfactory.factories.AbstractFactory;
import pihnastyi.creational.abstractfactory.objects.button.Button;
import pihnastyi.creational.abstractfactory.objects.checkbox.CheckBox;
import pihnastyi.creational.abstractfactory.objects.customobject.CustomObject;

public class Application {
    private Button button;
    private CheckBox checkBox;
    private CustomObject customObject;

    public Application(AbstractFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
        customObject = factory.createCustomObject();
    }

    public void print() {
        button.paint();
        checkBox.paint();
        customObject.paint();
    }
}
