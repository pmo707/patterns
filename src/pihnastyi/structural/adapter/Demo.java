package pihnastyi.structural.adapter;

import pihnastyi.structural.adapter.car.Audi;
import pihnastyi.structural.adapter.car.Car;
import pihnastyi.structural.adapter.car.WrapperChild;
import pihnastyi.structural.adapter.child.Child;
import pihnastyi.structural.adapter.child.ChildMaksym;

public class Demo {
    public static void main(String[] args) {
        Car car = new Audi();
        CarWash carWash = new CarWash();
        carWash.washCar(car);// washing Car

        Child child = new ChildMaksym();
        CarWash carWash1 = new CarWash();
        carWash1.washCar(new WrapperChild(child));//washing Child
    }
}
