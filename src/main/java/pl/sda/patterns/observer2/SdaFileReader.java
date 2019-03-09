package pl.sda.patterns.observer2;

import java.io.*;
import java.util.*;

class SdaFileReader {

    private List<IObserver> observers;

    public SdaFileReader() {
        this.observers = new ArrayList<>();

        // utworzenie nowej implementacji obserwatora z wykorzystaniem lambdy
        observers.add((x) -> {
            String filePath = "/home/michal/reader.log";
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
                String lineCount = x.get(ObserverParams.FILE_LINE_COUNT);
                String fileName = x.get(ObserverParams.FILE_NAME);

                bufferedWriter.write(new Date().toString() +
                        " " + fileName + " " + lineCount);

                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    void readFile(String filePath) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {

            Integer counter = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                counter++;
            }

            Map<ObserverParams, String> params = new HashMap<>();
            params.put(ObserverParams.FILE_LINE_COUNT, counter.toString());
            params.put(ObserverParams.FILE_NAME, filePath);
            notifyObservers(params);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void notifyObservers(Map<ObserverParams, String> params) {
        observers.forEach(x -> x.notify(params));
    }
}
