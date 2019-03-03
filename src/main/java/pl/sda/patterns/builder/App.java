package pl.sda.patterns.builder;

public class App {
    public static void main(String[] args) {
        AddressBuilder addressBuilder = new AddressBuilder();
        Address address = addressBuilder.withCity("Poznan").withPostalCode("60-244")
                .withSteet("Dąbrowskiego").withApartmentNumber("79A").build();

        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.withName("Jan").withLastName("Kowalski")
                .withAge(30).withSex(Sex.MALE).withAddress(address).build();
    }
}
