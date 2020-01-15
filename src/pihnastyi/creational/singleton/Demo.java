package pihnastyi.creational.singleton;

public class Demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance(11);
        System.out.println(singleton);
        Singleton instance = Singleton.getInstance(123);
        System.out.println(instance);
    }
}
