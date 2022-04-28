public class DRoot {
    public static int digital_root(int n) {
        int sum = 0;
        if (Integer.toString(n).length() == 1) {
            return n;
        }
        for (char element : Integer.toString(n).toCharArray()) {
            sum += Character.getNumericValue(element);
        }
        sum = digital_root(sum);

        return sum;

    }
}