package pl.sda.patterns.observer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileOutputObservator implements Observator {

    @Override
    public void notify(Double number) {
        if (number > 100) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/michal/calculator.log"))) {
                bufferedWriter.write(new Date().toString() + " Suma liczb jest większa niż 100");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
