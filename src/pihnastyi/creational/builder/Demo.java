package pihnastyi.creational.builder;

public class Demo {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder(1).setY(2).build();
        System.out.println(computer);
    }
}
