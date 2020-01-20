package pihnastyi.structural.proxy;

public class Demo {

    public static void main(String[] args) {
        Car audi = new Audi();
        audi.drive();
        System.out.println("<===============================>");
        Car proxy = new ProxyCar(audi);
        proxy.drive();
    }
}
