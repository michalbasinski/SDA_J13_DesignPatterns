package pl.sda.patterns.adapter;

public class CatImpl implements Cat {
    private String name;

    public CatImpl(String name) {
        this.name = name;
    }

    @Override
    public void meow() {
        System.out.println("Kot " + name + " miałczy");
    }
}
