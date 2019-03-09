package pl.sda.patterns.adapter5;

class App {
    public static void main(String[] args) {

        // tradycyjna klasa anonimowa
        Dish dishAnonymous = new Dish() {
            @Override
            public void eat() {
                System.out.println("Jem (klasa anonimowa)");
            }
        };

        // klasa anonimowa - wersja z lambdą
        Dish dish = () -> {
            System.out.println("Jem");
        };

        // klasa anonimowa wersja z lambdą
        Drink drink = () -> {
            System.out.println("Piję");
        };
        DrinkToDishAdapter adapter = new DrinkToDishAdapter(drink);

        // wywołania metody action
        action(dishAnonymous);
        action(dish);
        action(adapter);
    }

    static void action(Dish dish) {
        dish.eat();
    }
}
