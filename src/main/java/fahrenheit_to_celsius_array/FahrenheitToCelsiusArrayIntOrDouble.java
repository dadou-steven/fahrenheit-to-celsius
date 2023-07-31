package fahrenheit_to_celsius_array;

public class FahrenheitToCelsiusArrayIntOrDouble {

    // afficher le résultat

    public static void main(String[] args) {

        double[] fahrenheits = {65, 70, 75, 80, 85, 90, 95};

        double tempsMoyenne = (fahrenheits[0] + fahrenheits[1] + fahrenheits[2] + fahrenheits[3]
                                + fahrenheits[4] + fahrenheits[5] + fahrenheits[6]) / fahrenheits.length;

        System.out.println("Température Moyenne : " + tempsMoyenne);
    }

}
