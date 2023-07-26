package com.example.fahrenheit_to_celsius;

public class FahrenheitToCelsius {

    // déclaration de variables d'instance

    private int mondayFahrenheit;
    private int tuesdayFahrenheit;

    // constructeur

    public FahrenheitToCelsius(int mondayFahrenheit, int tuesdayFahrenheit) {
        this.mondayFahrenheit = mondayFahrenheit;
        this.tuesdayFahrenheit = tuesdayFahrenheit;
    }

    // accesseurs (getters) et mutateurs (setters)

    public int getMondayFahrenheit() {
        return mondayFahrenheit;
    }

    public void setMondayFahrenheit(int mondayFahrenheit) {
        this.mondayFahrenheit = mondayFahrenheit;
    }

    public int getTuesdayFahrenheit() {
        return tuesdayFahrenheit;
    }

    public void setTuesdayFahrenheit(int tuesdayFahrenheit) {
        this.tuesdayFahrenheit = tuesdayFahrenheit;
    }

    // méthodes

    public void mondayCelsius() {
        double monday = (5D / 9) * (mondayFahrenheit - 32);
        System.out.println(monday);
    }

    public void tuesdayCelsius() {
        double tuesday = (5D / 9) * (tuesdayFahrenheit - 32);
        System.out.println(tuesday);
    }

    public static void main(String[] args) {

        FahrenheitToCelsius solution = new FahrenheitToCelsius(78, 81);
        System.out.println("Température moyenne : ");
        System.out.print("Lundi Fahrenheit : " + solution.getMondayFahrenheit() + " -> En Celsius : ");
        solution.mondayCelsius();
        System.out.print("Mardi Fahrenheit : " + solution.getTuesdayFahrenheit() + " -> En Celsius : ");
        solution.tuesdayCelsius();
    }
}
