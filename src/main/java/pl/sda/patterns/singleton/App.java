package pl.sda.patterns.singleton;

public class App {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton == singleton1);
    }
}
