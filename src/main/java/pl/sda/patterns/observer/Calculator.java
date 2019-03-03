package pl.sda.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Observator> consoleOutputObservators = new ArrayList<>();

    public Double add(Double a, Double b) {
        double sum = a + b;
        notifyObservers(sum);
        return sum;
    }

    public void addObserver(Observator consoleOutputObservator) {
        consoleOutputObservators.add(consoleOutputObservator);
    }

    private void notifyObservers(Double number) {
        for (Observator consoleOutputObservator : consoleOutputObservators) {
            consoleOutputObservator.notify(number);
        }
    }
}
