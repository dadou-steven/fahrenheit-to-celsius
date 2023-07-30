package com.example.fahrenheit_to_celsius;

public class FahrenheitACelsius {

    // déclaration de variables d'instance

    int lundiFahrenheit;
    int mardiFahrenheit;

    // constructeur

    public FahrenheitACelsius(int lundiFahrenheit, int mardiFahrenheit) {
        this.lundiFahrenheit = lundiFahrenheit;
        this.mardiFahrenheit = mardiFahrenheit;
    }

    // méthodes

    /**
     * Spécification de la
     * méthode fahrenheit
     * @param celsius convertissant le degré fahrenheit
     */
    public void fahrenheit(double celsius) {
        System.out.println(celsius);
    }

    public double celsiusLundi() {
        return (5D / 9) * (lundiFahrenheit - 32);
    }

    public double celsiusMardi() {
        return (5D / 9) * (mardiFahrenheit - 32);
    }

    // afficher le résultat

    public static void main(String[] args) {

        FahrenheitACelsius solution = new FahrenheitACelsius(70, 90);

        solution.fahrenheit(solution.celsiusLundi());
        solution.fahrenheit(solution.celsiusMardi());

    }
}
