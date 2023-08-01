package fahrenheit_to_celsius_io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FahrenheitToCelsiusIO {

    // afficher le résultat

    public static void main(String[] args) {

        final int MAX_TEMPERATURE = 140;
        final int MIN_TEMP = 60;
        final int MAX_TEMP = 85;

        Scanner input = new Scanner(System.in);
        System.out.print("Entrer une valeur Fahrenheit : ");
        try {
            int fahrenheit = input.nextInt();
            System.out.print("Entrer un jour de la semaine : ");
            String days = input.next();
            double celsius = (fahrenheit - 32) * (5D / 9);

            while (fahrenheit >= MAX_TEMPERATURE) {
                System.out.println("Erreur : The ... " + MAX_TEMPERATURE);
                System.out.println("S'il vous plait ... ");
                fahrenheit = input.nextInt();
            }

            boolean raining = false;
            System.out.print("Les averses ? (oui/non) : ");
            String rainInput = input.next().toLowerCase();
            if (rainInput.startsWith("oui")) {
                raining = true;
            }

            System.out.printf("%s %s %.1f \n", days + " En Fahrenheit : ", fahrenheit + "° -> En Celsius : ", celsius);

            if ((fahrenheit >= MIN_TEMP) && (fahrenheit <= MAX_TEMP) && (!raining)) {
                System.out.println("Vive le beau temps !");
            } else if (fahrenheit > 85) {
                System.out.println("Reste à la maison, il fait très chaud !");
            } else if (fahrenheit < 60) {
                System.out.println("Reste à la maison, il fait froid !");
            } else {
                System.out.println("Ne sorte pas, il pleut !");
            }
        } catch (InputMismatchException e) {
            System.out.println("Désolé, ce n'est pas un entier.");
            System.out.println("Veillez réessayer d'il-vous-plaît.");
        }
    }
}
