import java.util.*;

public class PickPeaks {

    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        System.out.println(Arrays.toString(arr));

        Map<String, List<Integer>> result = new HashMap<>();
        result.put("pos", new ArrayList<>());
        result.put("peaks", new ArrayList<>());

        if (arr.length == 0) {
            return result;
        }

        int prewpos = 0;
        int prewpeak = arr[0];
        boolean decreasing = false;

        if (arr.length > 2 && arr[0] > arr[1]) {decreasing = true;}

        for (int i = 1; i < arr.length; i++) {
            if (prewpeak > arr[i] && !decreasing && i > 1) {
                result.get("pos").add(prewpos);
                result.get("peaks").add(prewpeak);
                decreasing = true;
            }
            if (decreasing && arr[i] > prewpeak) {
                decreasing = false;
            }
            if (prewpeak != arr[i]) {
                prewpos = i;
                prewpeak = arr[i];
            }
        }
        return result;
    }
}