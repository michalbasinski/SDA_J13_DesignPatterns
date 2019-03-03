package pl.sda.patterns.enums;

public class App {

    public static void main(String[] args) {
        Planets planet = Planets.EARTH;
        System.out.println("Liczba księżyców planety "
                + planet.getName() + ": " + planet.getMoonNumber());
    }

}
