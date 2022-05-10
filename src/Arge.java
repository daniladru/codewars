class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int countYear = 0;
        int population = p0;
        while (population < p) {
            countYear++;
            population += population*percent/100 + aug;
        }

        return countYear;
    }
}