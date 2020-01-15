package pihnastyi.creational.abstractfactory.factories;


import pihnastyi.creational.abstractfactory.objects.button.Button;
import pihnastyi.creational.abstractfactory.objects.checkbox.CheckBox;
import pihnastyi.creational.abstractfactory.objects.customobject.CustomObject;

public interface AbstractFactory {
    Button createButton();

    CheckBox createCheckBox();

    CustomObject createCustomObject();
    }
