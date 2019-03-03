package pl.sda.patterns.factory;

public class App {
    public static void main(String[] args) {
        FileWriterFactory factory = new FileWriterFactory();
        FileWriter writer = factory.produce("plik.xml");

        System.out.println(writer.getClass());
    }
}
