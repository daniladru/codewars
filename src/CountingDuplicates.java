import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        Map<Character, Integer> chMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            if (chMap.containsKey(ch)) {
                int count = chMap.get(ch);
                count++;
                chMap.put(ch, count);

            } else {
                chMap.put(ch, 1);
            }
        }

        int maxCount = 0;
        for (Map.Entry<Character, Integer> el : chMap.entrySet()) {
            if (el.getValue() > 1) {
                maxCount++;
            }
        }
        return maxCount;
    }
}