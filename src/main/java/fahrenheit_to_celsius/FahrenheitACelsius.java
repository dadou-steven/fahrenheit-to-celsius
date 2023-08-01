package fahrenheit_to_celsius;

public class FahrenheitACelsius {

    // déclaration de variables d'instance

    int lundiFahrenheit;
    int mardiFahrenheit;
    int mercrediFahrenheit;

    // constructeur

    public FahrenheitACelsius(int lundiFahrenheit, int mardiFahrenheit, int mercrediFahrenheit) {
        this.lundiFahrenheit = lundiFahrenheit;
        this.mardiFahrenheit = mardiFahrenheit;
        this.mercrediFahrenheit = mercrediFahrenheit;
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
        System.out.printf("Mardi Fahrenheit : %s %.1f°C\n", mardiFahrenheit + "°F -> En Celsius : ", celsius);
    }

    public double celsiusMardi() {
        return (5D / 9) * (mardiFahrenheit - 32);
    }

    /**
     * Spécification de la
     * méthode fahrenheitMercredi
     * @param celsius convertissant le degré fahrenheit
     */
    public void fahrenheitMercredi(double celsius) {
        System.out.printf("Mercredi Fahrenheit : %s %.1f°C\n\n", mercrediFahrenheit + "°F -> En Celsius : ", celsius);
    }

    public double celsiusMercredi() {
        return (5D / 9) * (mercrediFahrenheit - 32);
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
            System.out.println("Lundi : Danger, il fait très chaud, risque de chaleur !");
        }
        return true;
    }

    public boolean tempsMardi() {
        if ((mardiFahrenheit >= 65) && (mardiFahrenheit <= 85)) {
            System.out.println("Mardi : Cool, c'est le beau temps !");
        } else if (mardiFahrenheit < 65) {
            System.out.println("Mardi : Attention il fait froid, reste à la maison !");
        } else {
            System.out.println("Mardi : Danger, il fait très chaud, risque de chaleur !");
        }
        return true;
    }

    public boolean tempsMercredi() {
        if ((mercrediFahrenheit >= 65) && (mercrediFahrenheit <= 85)) {
            System.out.println("Mercredi : Cool, c'est le beau temps !");
        } else if (mercrediFahrenheit < 65) {
            System.out.println("Mercredi : Attention il fait froid, reste à la maison !");
        } else {
            System.out.println("Mercredi : Danger, il fait très chaud, risque de chaleur !");
        }
        return true;
    }

    // afficher le résultat

    public static void main(String[] args) {

        FahrenheitACelsius solution = new FahrenheitACelsius(55, 70, 95);

        solution.fahrenheitLundi(solution.celsiusLundi());
        solution.fahrenheitMardi(solution.celsiusMardi());
        solution.fahrenheitMercredi(solution.celsiusMercredi());
        solution.tempsCondition(solution.tempsLundi());
        solution.tempsCondition(solution.tempsMardi());
        solution.tempsCondition(solution.tempsMercredi());
    }
}
