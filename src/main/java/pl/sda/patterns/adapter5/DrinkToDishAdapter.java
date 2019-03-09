package pl.sda.patterns.adapter5;

class DrinkToDishAdapter implements Dish {
    private Drink drink;

    DrinkToDishAdapter(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void eat() {
        this.drink.drink();
    }

}
