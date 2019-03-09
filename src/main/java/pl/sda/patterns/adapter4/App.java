package pl.sda.patterns.adapter4;

class App {

    static void main(String[] args) {
        Dish dish = new DishImpl();

        Drink drink = new DrinkImpl();
        DrinkToDishAdapter adapter = new DrinkToDishAdapter(drink);

        action(dish);
        action(adapter);
    }

    static void action(Dish dish) {
        dish.eat();
    }

}
