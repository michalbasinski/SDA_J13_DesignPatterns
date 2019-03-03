package pl.sda.patterns.adapter;

public class DogImpl implements Dog {
    private String name;

    public DogImpl(String name) {
        this.name = name;
    }

    @Override
    public void bark() {
        System.out.println("Pies " + name + " szczeka");
    }
}
