package pihnastyi.creational.singleton;

public final class Singleton {
    private static Singleton instance;
    private int value;

    private Singleton(int value) {
        this.value = value;
    }

    public static Singleton getInstance(int value) {
        if (instance == null) {
            instance=new Singleton(value);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "value=" + value +
                '}';
    }
}
