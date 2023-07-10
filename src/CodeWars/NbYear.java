package CodeWars;

public class NbYear {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        int population = p0;

        while (population < p) {
            years++;
            population += ((population * percent / 100) + aug);

        }

        return years;
    }
}
