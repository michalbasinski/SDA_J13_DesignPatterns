package pl.sda.patterns.adapter2;

import pl.sda.patterns.builder.Person;

public class App {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jan");
        person.setLastName("Kowalski");

        Car car = new Car("PO 1111");
        CarToPersonAdapter adaptedCar = new CarToPersonAdapter(car);

        sayName(person);
        sayName(adaptedCar);

    }

    private static void sayName(Person person) {
        System.out.println(person.getName() + " " + person.getLastName());
    }
}
