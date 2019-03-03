package pl.sda.patterns.enums;

public enum Planets {
    EARTH(1, "Ziemia"), MARS(2, "Mars"), VENUS(0, "Wenus"),
    MERCURY(0, "Merkury"), JUPITER(79, "Jowisz"),
    SATURN(62, "Saturn"),URANUS(27, "Uran"), NEPTUNE(14, "Neptun");

    int moonNumber;
    String name;

    Planets(int moonNumber, String name) {
        this.moonNumber = moonNumber;
        this.name = name;
    }

    public int getMoonNumber() {
        return moonNumber;
    }

    public String getName() {
        return name;
    }
}
