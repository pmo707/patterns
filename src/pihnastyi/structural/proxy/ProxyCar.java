package pihnastyi.structural.proxy;

public class ProxyCar implements Car {
    private Car car;

    public ProxyCar(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        System.out.println("do something in proxy class between car will drive");
        car.drive();
    }
}
