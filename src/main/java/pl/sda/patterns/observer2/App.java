package pl.sda.patterns.observer2;

public class App {
    public static void main(String[] args) {
        SdaFileReader fileReader = new SdaFileReader();
        fileReader.readFile("/home/michal/custom.csv");
    }
}
