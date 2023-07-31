package fahrenheit_to_celsius_list;

import java.util.ArrayList;

public class FahrenheitToCelsiusList {

    // afficher le résultat

    public static void main(String[] args) {

        // String

        ArrayList<String> semaines = new ArrayList<>();
        semaines.add("Lundi");
        semaines.add("Mardi");
        semaines.add("Mercredi");
        semaines.add("Jeudi");
        semaines.add("Vendredi");
        semaines.add("Samedi");
        semaines.add("Dimanche");
        System.out.println(semaines.toString());

        semaines.remove("Lundi");
        System.out.println(semaines.toString());
        System.out.println(semaines.contains("Lundi"));
        System.out.println(semaines.contains("Mardi"));

        semaines.add("Lundi");
        System.out.println(semaines.toString());

        // Integer

        ArrayList<Integer> temperatures = new ArrayList<>();
        temperatures.add(90);
        temperatures.add(95);
        temperatures.add(110);
        temperatures.add(99);
        temperatures.add(105);
        System.out.println(temperatures.toString());

        int degree = 0;
        for (Integer temperature : temperatures) {
            degree += temperature;
        }
        System.out.println("Températures : " + degree + "°K.");
    }
}
