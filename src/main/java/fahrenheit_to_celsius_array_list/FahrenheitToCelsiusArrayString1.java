package fahrenheit_to_celsius_array_list;

public class FahrenheitToCelsiusArrayString1 {

    // afficher le résultat

    public static void main(String[] args) {

        String[] jours = {"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};

        String result = "non trouvé, essai encore.";

        for (String jour : jours) {
            if (jour.equals("mardi")) {
                result = "trouvé, c'est mon jour de naissance.";
                break;
            }
        }
        System.out.println(result);
    }
}
