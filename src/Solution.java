import java.nio.charset.Charset;
import java.util.function.Function;
import java.util.*;

import java.util.stream.Collectors;

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

    static int stray(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer element : numbers) {
            if (map.get(element) == null) {
                map.put(element, 1);
            } else map.put(element, map.get(element) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;

    }

    public static int areaOrPerimeter(int l, int w) {
        return (l == w) ? l * w : 2 * (l + w);
    }

    public static <T, R> R[][] gridMap(Function<T, R> fn, T[][] list) {
        return (R[][]) Arrays.stream(list).map(e -> Arrays.stream(e).map(fn).toArray(Object[]::new)).toArray(Object[][]::new);

    }

    public static int fourSeven(int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>() {{
            put(4, 7);
            put(7, 4);
        }};
        try {
            return map.get(n);
        } catch (Throwable t) {
            return 0;
        }


    }


    public static String generateName(PhotoManager photoManager) {
        public static String generateName (PhotoManager photoManager){
            SecureRandom random = new SecureRandom();
            String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
            String name = "";
            do {
                name = "";
                for (int i = 0; i < 6; i++) {
                    int rndCharAt = random.nextInt(CHAR_LOWER.length());
                    char rndChar = CHAR_LOWER.charAt(rndCharAt);
                    name += rndChar;
                }
                System.out.println(name);
            } while (photoManager.nameExists(name) == true);

            return name;
        }
    }
}
