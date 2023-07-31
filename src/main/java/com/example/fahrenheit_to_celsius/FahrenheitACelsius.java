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
     * méthode fahrenheitLundi
     * @param celsius convertissant le degré fahrenheit
     */
    public void fahrenheitLundi(double celsius) {
        System.out.printf("Lundi Fahrenheit : %s %.1f°C\n", lundiFahrenheit + "°F -> En Celsius : ", celsius);
    }

    public double celsiusLundi() {
        return (5D / 9) * (lundiFahrenheit - 32);
    }

    /**
     * Spécification de la
     * méthode fahrenheitMardi
     * @param celsius convertissant le degré fahrenheit
     */
    public void fahrenheitMardi(double celsius) {
        System.out.printf("Mardi Fahrenheit : %s %.1f°C\n\n", mardiFahrenheit + "°F -> En Celsius : ", celsius);
    }

    public double celsiusMardi() {
        return (5D / 9) * (mardiFahrenheit - 32);
    }

    public void tempsCondition(boolean temps) {
        System.out.println(temps);
    }

    public boolean tempsLundi() {
        if ((lundiFahrenheit >= 65) && (lundiFahrenheit <= 85)) {
            System.out.println("Lundi : Cool, c'est le beau temps !");
        } else if (lundiFahrenheit < 65) {
            System.out.println("Lundi : Attention il fait froid, reste à la maison !");
        } else {
            System.out.println("Lundi : Danger, il fait très chad, risque de chaleur !");
        }
        return true;
    }

    public boolean tempsMardi() {
        if ((mardiFahrenheit >= 65) && (mardiFahrenheit <= 85)) {
            System.out.println("Mardi : Cool, c'est le beau temps !");
        } else if (mardiFahrenheit < 65) {
            System.out.println("Mardi : Attention il fait froid, reste à la maison !");
        } else {
            System.out.println("Mardi : Danger, il fait très chad, risque de chaleur !");
        }
        return true;
    }

    // afficher le résultat

    public static void main(String[] args) {

        FahrenheitACelsius solution = new FahrenheitACelsius(70, 90);

        solution.fahrenheitLundi(solution.celsiusLundi());
        solution.fahrenheitMardi(solution.celsiusMardi());
        solution.tempsCondition(solution.tempsLundi());
        solution.tempsCondition(solution.tempsMardi());
    }
}
