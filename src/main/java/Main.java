import pizzas.Hawaiian;
import pizzas.Margherita;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Margherita margheritaPizza = new Margherita();
        margheritaPizza.preparePizza();
        System.out.println("--------------");
//        Margherita margheritaPizza2 = new Margherita(Arrays.asList("pieczarki", "szynka"));
//        margheritaPizza2.preparePizza();
        Margherita margheritaPizza3 = new Margherita("cebula", "papryka");
        margheritaPizza3.preparePizza();
    }
}
