public class CodeWarsMath {
    public static int nearestSq(final int n) {
        int result = 0;
        int sqr = (int) Math.sqrt(n);

        if (n - Math.pow(sqr, 2) < Math.pow(sqr + 1, 2) - n) {
            result = sqr * sqr;
        } else {
            result = (sqr + 1) * (sqr + 1);
        }

        return result;
    }
}