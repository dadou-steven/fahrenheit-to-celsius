package fahrenheit_to_celsius_list;

public class Weather<T extends Comparable<T>> {

    // déclaration de variables d'instance

    private T jours1;
    private T jours2;

    // constructeur

    public Weather(T jours1, T jours2){
        this.jours1 = jours1;
        this.jours2 = jours2;
    }

    // accesseurs (getters) et mutateurs (setters)

    public void setJours1(T jours1) {
        this.jours1 = jours1;
    }

    public T getJours2() {
        return jours2;
    }

    public void setJours2(T jours2) {
        this.jours2 = jours2;
    }

    public Object getJours1() {
        return jours1;
    }

    // méthodes

    public T dayCompare() {
        return (jours1.compareTo(jours2) >= 0 ? jours1 : jours2);
    }

    // afficher le résultat

    public static void main(String[] args) {

        Weather<String> semaine = new Weather<>("Lundi, Mardi", "Mercredi, Jeudi");
        System.out.println(semaine.dayCompare());
    }
}
