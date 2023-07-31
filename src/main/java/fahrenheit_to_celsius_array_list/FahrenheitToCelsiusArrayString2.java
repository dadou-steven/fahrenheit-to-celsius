package fahrenheit_to_celsius_array_list;

public class FahrenheitToCelsiusArrayString2 {

    // afficher le résultat

    public static void main(String[] args) {

        String[] jours = new String[7];
        jours[0] = "lundi";
        jours[1] = "mardi";
        jours[2] = "mercredi";
        jours[3] = "jeudi";
        jours[4] = "vendredi";
        jours[5] = "samedi";
        jours[6] = "dimanche";

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
