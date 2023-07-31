package fahrenheit_to_celsius_array;

public class FahrenheitToCelsiusFor {

    // afficher le résultat

    public static void main(String[] args) {

        double[] fahrenheits = {60, 65, 70, 75, 80, 85, 90};

        double temps = 0;

        /*
        for (int index = 0; index < fahrenheits.length; index++) {
            temps = temps + fahrenheits[index];
        }
        */

        for (double fahrenheit : fahrenheits) {
            temps = temps + fahrenheit;
        }

        double tempsMoyenne = temps / fahrenheits.length;

        System.out.println("Température moyenne : " + tempsMoyenne);

        // Utilisation d'argument (args)

        double jour = 0;
        for (String day : args) {
            jour += Double.parseDouble(day);
        }
        double moyenne = (args.length > 0) ? (jour / args.length) : 0;
        System.out.println(moyenne);
    }
}
