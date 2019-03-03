package pl.sda.patterns.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new DogImpl("Azor"));
        dogs.add(new DogImpl("Burek"));

        List<Cat> cats = new ArrayList<>();
        cats.add(new CatImpl("Puszek"));
        cats.add(new CatImpl("Mruczek"));

        List<Dog> adaptedCats = cats.stream()
                .map(x -> new CatToDogAdapter(x))
                .collect(Collectors.toList());

        // alternatywa dla powyższej lambdy
//        List<Dog> adaptedCats2 = new ArrayList<>();
//        for (Cat cat : cats) {
//            adaptedCats2.add(new CatToDogAdapter(cat));
//        }

        dogs.addAll(adaptedCats);

        //duży skomplikowany kod, robiący dużo dziwnych rzeczy
        for (Dog dogImpl : dogs) {
            dogImpl.bark();
        }

    }

}
