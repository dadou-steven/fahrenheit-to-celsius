package com.fahrenheit_to_celsius_io;

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
        System.out.print("Entrer le jour concerné : ");
        String days = input.next();
        double celsius = (fahrenheit - 32) * (5D / 9);
        System.out.printf("%s %s %.1f \n", days + " En Fahrenheit : ", fahrenheit + "° -> En Celsius : ", celsius);

        if ((fahrenheit >= 60) && (fahrenheit <= 85)) {
            System.out.println("Vive le beau temps !");
        } else if (fahrenheit > 85) {
            System.out.println("Reste à la maison, il fait très chaud !");
        } else {
            System.out.println("Reste à la maison, il fait froid !");
        }
    }
}

// https://github.com/dadou-steven/fahrenheit-to-celsius/blob/main/src/main/java/com/example/fahrenheit_to_celsius/FahrenheitToCelsius.java
