public class Spiralizor {
    public static int[][] spiralize(int size) {
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = 0;
            }
        }

        int rows = result.length;
        int cols = result[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        int dir = 1;
        int step = 0;

        while (top < bottom && left < right) {
            if (dir == 1) {    // left->right
                right-=step;
                for (int i = left; i <= right; ++i) {
                    result[top][i] = 1;
                }
                ++top;
                dir = 2;
            } else if (dir == 2) {     // top->bottom
                bottom-=step;
                for (int i = top; i <= bottom; ++i) {
                    result[i][right] = 1;
                }
                --right;
                dir = 3;
            } else if (dir == 3) {     // left <- right
                left+=step;
                for (int i = right; i >= left; --i) {
                    result[bottom][i] = 1;
                }
                --bottom;
                dir = 4;
            } else if (dir == 4) {     // up <- bottom
                step = 1;
                top+=step;
                for (int i = bottom; i >= top; --i) {
                    result[i][left] = 1;
                }
                ++left;
                dir = 1;
            }
        }

        return result;
    }
}
