package pihnastyi.creational.abstractfactory;

import pihnastyi.creational.abstractfactory.factories.MacFactory;
import pihnastyi.creational.abstractfactory.factories.WinFactory;
import pihnastyi.creational.abstractfactory.objects.button.Button;

public class Demo {

    public static void main(String[] args) {

        Application application = new Application(new MacFactory());
        Application application1 = new Application(new WinFactory());
        application.print();
        application1.print();
        MacFactory mac = new MacFactory();
        Button button = mac.createButton();
        button.paint();
        application.print();

    }
}
