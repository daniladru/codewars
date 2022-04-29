import java.util.ArrayList;
import java.util.Arrays;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        System.out.println(Arrays.toString(commentSymbols));
        System.out.println(text);
        boolean first = true;
        String result = "";
        for (String row : text.split("\\n")) {
            for (String symbol : commentSymbols) {
                if (row.indexOf(symbol) != -1) {
                    row = row.substring(0, row.indexOf(symbol));
                }
            }
            result += (first) ? "" : "\n";
            first = false;
            result += row.stripTrailing();
        }

        return result;
    }
}
