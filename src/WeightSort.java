import java.util.*;
import java.util.stream.Collectors;

public class WeightSort {

    public static String orderWeight(String strng) {
        ArrayList<Integer> unicInt = new ArrayList<Integer>();
        HashMap<Integer, String> mapStrInt = new HashMap<Integer, String>();
        String[] strArray = strng.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            int[] charArray = new int[strArray[i].length()];
            for (int j = 0; j < strArray[i].length(); j++) {
                charArray[j] = Integer.parseInt(strArray[i].substring(j, j + 1));
            }
            int sum = Arrays.stream(charArray).sum();
            if (mapStrInt.get(sum) == null) {
                mapStrInt.put(sum, strArray[i]);
            } else {
                mapStrInt.put(sum, mapStrInt.get(sum) + " " + strArray[i]);
            } if (unicInt.indexOf(sum) == -1) {
                unicInt.add(sum);
            }
        } Collections.sort(unicInt);

        ArrayList<String> result = new ArrayList<String>();
        for (Integer curInteger : unicInt) {
            String curStr = mapStrInt.get(curInteger);
            String[] arrayStr = curStr.split(" ");
            Arrays.sort(arrayStr);
              for (String word : arrayStr) {
                result.add(word);
            }
        }

        return String.join(" ", result);
    }
}