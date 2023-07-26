package com.fahrenheit_to_celsius_io;
// https://github.com/dadou-steven/fahrenheit-to-celsius/blob/main/src/main/java/com/example/fahrenheit_to_celsius/FahrenheitToCelsius.java

import java.util.Scanner;

public class FahrenheitToCelsiusIO {

    // déclaration de variables d'instance

    private int fahrenheit;

    // constructeur

    public FahrenheitToCelsiusIO() {
    }

    // accesseurs (getters) et mutateurs (setters)

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    // méthodes

    public void fahrenheitCelsius() {
        double jours = (fahrenheit - 32) * (5D / 9);
        System.out.println(jours);
    }

    // afficher le résultat

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Entrer une valeur Fahrenheit : ");
        int fahrenheit = input.nextInt();
        double celsius = (fahrenheit - 32) * (5D / 9);
        System.out.println("Journée Fahrenheit : " + fahrenheit + " -> En Celsius : " + celsius);
    }
}
