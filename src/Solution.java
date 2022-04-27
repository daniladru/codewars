import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solutionMultiplesof3or5(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static String getMiddle(String word) {
        String result = "";
        if (word.length() % 2 == 0) {
            result = word.substring((word.length() / 2) - 1, (word.length() / 2) + 1);
        } else {
            result = word.substring((word.length() - 1) / 2, 1 + (word.length() - 1) / 2);
        }
        return result;
    }

    public static List<Object> filterList(final List<Object> list) {
        List result = new ArrayList();
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) instanceof Integer) {
                result.add(list.get(i));
            }
        }
        return result;
    }

}
