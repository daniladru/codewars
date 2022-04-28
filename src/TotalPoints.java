import java.util.Arrays;

public class TotalPoints {
    public static int points(String[] games) {
        System.out.println(Arrays.toString(games));
        int sum = 0;
        for (String game : games) {
            String[] xy_game = game.split(":");
            int x = Integer.parseInt(xy_game[0]);
            int y = Integer.parseInt(xy_game[1]);
            if (x > y) {
                sum += 3;
            } else if (x == y) {
                sum += 1;
            }
        }
        return sum;
    }
}
