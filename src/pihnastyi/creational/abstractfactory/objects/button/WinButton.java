package pihnastyi.creational.abstractfactory.objects.button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("created win Button");
    }
}
