package pihnastyi.creational.factorymethod;

import pihnastyi.creational.factorymethod.buttons.Button;
import pihnastyi.creational.factorymethod.factory.Factory;
import pihnastyi.creational.factorymethod.factory.MacFactory;

public class Demo {

    public static void main(String[] args) {
        Factory factory = new MacFactory();
        Button button = factory.createButton();
        button.print();


    }
}
