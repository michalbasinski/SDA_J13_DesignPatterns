package pl.sda.patterns.adapter2;

import pl.sda.patterns.builder.Person;

public class CarToPersonAdapter extends Person {

    private Car car;

    public CarToPersonAdapter(Car car) {
        this.car = car;
    }

    @Override
    public String getName() {
        return car.getRegistrationNumber().split(" ")[0];
    }

    @Override
    public  String getLastName() {
        return car.getRegistrationNumber().split(" ")[1];
    }
}
