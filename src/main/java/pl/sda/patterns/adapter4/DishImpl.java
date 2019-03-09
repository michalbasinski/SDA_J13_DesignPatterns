package pl.sda.patterns.adapter4;

class DishImpl implements Dish {
    @Override
    public void eat() {
        System.out.println("Jem");
    }
}
