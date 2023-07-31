package fahrenheit_to_celsius;

public class FahrenheitToCelsius {

    // déclaration de variables d'instance

    private int mondayFahrenheit;
    private int tuesdayFahrenheit;
    private int wednesdayFahrenheit;
    private int thursdayFahrenheit;
    private int fridayFahrenheit;
    private int saturdayFahrenheit;
    private int sundayFahrenheit;

    // constructeur

    public FahrenheitToCelsius(int mondayFahrenheit, int tuesdayFahrenheit, int wednesdayFahrenheit, int thursdayFahrenheit,
                               int fridayFahrenheit, int saturdayFahrenheit, int sundayFahrenheit) {
        this.mondayFahrenheit = mondayFahrenheit;
        this.tuesdayFahrenheit = tuesdayFahrenheit;
        this.wednesdayFahrenheit = wednesdayFahrenheit;
        this.thursdayFahrenheit = thursdayFahrenheit;
        this.fridayFahrenheit = fridayFahrenheit;
        this.saturdayFahrenheit = saturdayFahrenheit;
        this.sundayFahrenheit = sundayFahrenheit;
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

    public int getWednesdayFahrenheit() {
        return wednesdayFahrenheit;
    }

    public void setWednesdayFahrenheit(int wednesdayFahrenheit) {
        this.wednesdayFahrenheit = wednesdayFahrenheit;
    }

    public int getThursdayFahrenheit() {
        return thursdayFahrenheit;
    }

    public void setThursdayFahrenheit(int thursdayFahrenheit) {
        this.thursdayFahrenheit = thursdayFahrenheit;
    }

    public int getFridayFahrenheit() {
        return fridayFahrenheit;
    }

    public void setFridayFahrenheit(int fridayFahrenheit) {
        this.fridayFahrenheit = fridayFahrenheit;
    }

    public int getSaturdayFahrenheit() {
        return saturdayFahrenheit;
    }

    public void setSaturdayFahrenheit(int saturdayFahrenheit) {
        this.saturdayFahrenheit = saturdayFahrenheit;
    }

    public int getSundayFahrenheit() {
        return sundayFahrenheit;
    }

    public void setSundayFahrenheit(int sundayFahrenheit) {
        this.sundayFahrenheit = sundayFahrenheit;
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

    public void wednesdayCelsius() {
        double mercredi = (5D / 9) * (wednesdayFahrenheit - 32);
        System.out.println(mercredi);
    }

    public void thursdayCelsius() {
        double jeudi = (5D / 9) * (thursdayFahrenheit - 32);
        System.out.println(jeudi);
    }

    public void fridayCelsius() {
        double vendredi = (5D / 9) * (fridayFahrenheit - 32);
        System.out.println(vendredi);
    }

    public void saturdayCelsius() {
        double samedi = (5D / 9) * (saturdayFahrenheit - 32);
        System.out.println(samedi);
    }

    public void sundayCelsius() {
        double dimanche = (5D / 9) * (sundayFahrenheit - 32);
        System.out.println(dimanche);
    }

    // afficher le résultat

    public static void main(String[] args) {

        FahrenheitToCelsius solution = new FahrenheitToCelsius(60, 65, 70, 75, 80, 85, 90);
        
        System.out.println("Température moyenne : \n");
        
        System.out.print("Lundi Fahrenheit    : " + solution.getMondayFahrenheit() + " -> En Celsius : ");
        solution.mondayCelsius();
        System.out.print("Mardi Fahrenheit    : " + solution.getTuesdayFahrenheit() + " -> En Celsius : ");
        solution.tuesdayCelsius();
        System.out.print("Mercredi Fahrenheit : " + solution.getWednesdayFahrenheit() + " -> En Celsius : ");
        solution.wednesdayCelsius();
        System.out.print("Jeudi Fahrenheit    : " + solution.getThursdayFahrenheit() + " -> En Celsius : ");
        solution.thursdayCelsius();
        System.out.print("Vendredi Fahrenheit : " + solution.getFridayFahrenheit() + " -> En Celsius : ");
        solution.fridayCelsius();
        System.out.print("Samedi Fahrenheit   : " + solution.getSaturdayFahrenheit() + " -> En Celsius : ");
        solution.saturdayCelsius();
        System.out.print("Dimanche Fahrenheit : " + solution.getSundayFahrenheit() + " -> En Celsius : ");
        solution.sundayCelsius();
    }
}

// voir aussi

// https://github.com/dadou-steven/fahrenheit-to-celsius/blob/main/src/main/java/com/example/fahrenheit_to_celsius/FahrenheitACelsius.java
// https://github.com/dadou-steven/fahrenheit-to-celsius/blob/main/src/main/java/com/fahrenheit_to_celsius_io/FahrenheitToCelsiusIO.java
