package pl.sda.patterns.observer;


public class ConsoleOutputObservator implements Observator {

    @Override
    public void notify(Double number) {
        if (number % 55 == 0) {
            System.out.println("Podano liczby, których suma jest podzielna przez 55");
        }
    }
}
