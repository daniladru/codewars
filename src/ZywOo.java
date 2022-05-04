import java.util.ArrayList;

public class ZywOo {
    public static int[] multipleOfIndex(int[] array) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < array.length; i++) {
            if (array[i]%i == 0) {result.add(array[i]);}
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}