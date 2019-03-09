package pl.sda.patterns.adapter4;

class DrinkImpl implements Drink {
    @Override
    public void drink() {
        System.out.println("Piję");
    }
}
