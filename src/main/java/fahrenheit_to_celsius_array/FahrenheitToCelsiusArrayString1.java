package fahrenheit_to_celsius_array;

public class FahrenheitToCelsiusArrayString1 {

    // méthodes

    public static boolean rechercheFahrenheitAB(String day, String[] jours) {
        boolean result = false;
        for (String jour : jours) {
            if ((jour != null) && (jour.equals(day))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static String rechercheFahrenheitArray(String day, String[] jours) {

        String result = "non trouvé, essai encore.";
        for (String jour : jours) {
            if (jour.equals(day)) {
                result = "trouvé, c'est mon jour de naissance.";
                break;
            }
        }
        return result;
    }

    // afficher le résultat

    public static void main(String[] args) {

        String[] jours = {"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};

        System.out.println(rechercheFahrenheitArray("mardi", jours));
        System.out.println(rechercheFahrenheitArray("août", jours));
        System.out.println(rechercheFahrenheitAB("mardi", jours));
        System.out.println(rechercheFahrenheitAB("août", jours));
    }
}
