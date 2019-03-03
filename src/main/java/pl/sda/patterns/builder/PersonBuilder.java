package pl.sda.patterns.builder;

public class PersonBuilder {
    private Person personToBuild;

    public PersonBuilder() {
        this.personToBuild = new Person();
    }

    public PersonBuilder withName(String name) {
        personToBuild.setName(name);
        return this;
    }

    public PersonBuilder withLastName(String lastName) {
        personToBuild.setLastName(lastName);
        return this;
    }

    public PersonBuilder withAge(int age) {
        personToBuild.setAge(age);
        return this;
    }

    public PersonBuilder withAddress(Address address) {
        personToBuild.setAddress(address);
        return this;
    }

    public PersonBuilder withSex(Sex sex) {
        personToBuild.setSex(sex);
        return this;
    }

    public Person build() {
        return personToBuild;
    }
}
