import java.util.ArrayList;

public class JosephusSurvivor {
    private static int removeElement(ArrayList<Integer> array, int fromi, int k) {
        int count = 1;
        int i = fromi;
        while (count < k) {
            count++;
            i++;
            if (i >= array.size()) {
                i = 0;
            }
        }
        array.remove(i);
        if (i >= array.size()) {
            i = 0;
        }
        return i;
    }

    public static int josephusSurvivor(final int n, final int k) {
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }

        int fromI = 0;
        while (arr.size() > 1) {
            fromI = removeElement(arr, fromI, k);
        }

        return arr.get(0);
    }
}