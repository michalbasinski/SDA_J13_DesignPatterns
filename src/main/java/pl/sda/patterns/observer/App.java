package pl.sda.patterns.observer;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.addObserver(new ConsoleOutputObservator());
        calculator.addObserver(new FileOutputObservator());


        while (true) {
            String scanned = scanner.nextLine();
            String replaced = scanned.replace(" ", "");
            String[] tokens = replaced.split("\\+");
            double a = Double.parseDouble(tokens[0]);
            double b = Double.parseDouble(tokens[1]);
            System.out.println("Wynik dodawania="+calculator.add(a,b));

        }

    }
}
