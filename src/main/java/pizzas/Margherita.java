package pizzas;

import interfaces.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Margherita implements Pizza {
    List<String> skladniki = new ArrayList<String>(Arrays.asList("mąka", "jajka", "woda", "sól"));

    public Margherita() {}

    public Margherita(List<String> produkty) {
        this.skladniki.addAll(produkty);
    }

    public Margherita(String... args) {
        for (int i = 0; i < args.length; i++) {
            this.skladniki.add(args[i]);
        }
    }

    public void preparePizza() {
        skladniki.forEach(x -> System.out.println(x));

    }
}