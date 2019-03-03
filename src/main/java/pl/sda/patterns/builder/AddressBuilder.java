package pl.sda.patterns.builder;

public class AddressBuilder {

    private Address addressToBuild;

    public AddressBuilder() {
        addressToBuild = new Address();
    }

    public AddressBuilder withCity(String city) {
        addressToBuild.setCity(city);
        return this;
    }

    public AddressBuilder withSteet(String street) {
        addressToBuild.setStreet(street);
        return this;
    }

    public AddressBuilder withPostalCode(String postalCode) {
        addressToBuild.setPostalCode(postalCode);
        return this;
    }

    public AddressBuilder withApartmentNumber(String apartmentNumber) {
        addressToBuild.setApartmentNumber(apartmentNumber);
        return this;
    }

    public AddressBuilder withNumber(String number) {
        addressToBuild.setNumber(number);
        return this;
    }

    public Address build() {
        return addressToBuild;
    }
}
