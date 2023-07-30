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

    // accesseurs (getters) et mutateurs (setters)

    public int getLundiFahrenheit() {
        return lundiFahrenheit;
    }

    public void setLundiFahrenheit(int lundiFahrenheit) {
        this.lundiFahrenheit = lundiFahrenheit;
    }

    public int getMardiFahrenheit() {
        return mardiFahrenheit;
    }

    public void setMardiFahrenheit(int mardiFahrenheit) {
        this.mardiFahrenheit = mardiFahrenheit;
    }

    // méthodes

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

        FahrenheitACelsius solution = new FahrenheitACelsius(78, 81);

        solution.fahrenheit(solution.celsiusLundi());
        solution.fahrenheit(solution.celsiusMardi());

    }
}
