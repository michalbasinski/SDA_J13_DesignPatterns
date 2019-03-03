package pl.sda.patterns.singleton;

public class SingletonSafe {

    private static SingletonSafe instance = new SingletonSafe();

    private SingletonSafe() {
    }

    public static SingletonSafe getInstance() {
        return instance;
    }
}
