package pl.sda.patterns.adapter4;

class DishToDrinkAdapter implements Drink {
    private Dish dish;

    DishToDrinkAdapter(Dish dish) {
        this.dish = dish;
    }

    @Override
    public void drink() {
        this.dish.eat();
    }
}
