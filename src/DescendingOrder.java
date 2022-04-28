import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        int[] numbers = new int[Integer.toString(num).length()];
        int i = 0;
        for (char element : Integer.toString(num).toCharArray()) {
            numbers[i++] = Character.getNumericValue(element);
        }
        numbers = Arrays.stream(numbers).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        String resultstr = "";
        for (int element : numbers) {
            resultstr += element;
        }
        return Integer.parseInt(resultstr);
    }
}