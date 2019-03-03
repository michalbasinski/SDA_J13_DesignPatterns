package pl.sda.patterns.adapter;

public class CatToDogAdapter implements Dog {

    private Cat cat;

    public CatToDogAdapter(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void bark() {
        cat.meow();
    }
}
