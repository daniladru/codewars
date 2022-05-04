public class Snail {

    public static int[] snail(int[][] array) {
        if (array[0].length == 0) {
            int[] result = new int[]{};
            return result;}

        int[] result = new int[array.length * array.length];
        int Summ = array.length * array.length;
        int sizeY = array.length;
        int sizeX = array.length;
        int CorrectY = 0;
        int CorrectX = 0;
        int Count = 0;
        while (sizeY > 0) {
            for (int y = 0; y < 4; y++) {
                for (int x = 0; x < ((sizeX < sizeY) ? sizeY : sizeX); x++) {
                    if (y == 0 && x < sizeX - CorrectX && Count <= Summ)
                        result[Count++] = array[y + CorrectY][x + CorrectX];
                    if (y == 1 && x < sizeY - CorrectY && x != 0 && Count <= Summ)
                        result[Count++] = array[x + CorrectY][sizeX - 1];
                    if (y == 2 && x < sizeX - CorrectX && x != 0 && Count <= Summ)
                        result[Count++] = array[sizeY - 1][sizeX - (x + 1)];
                    if (y == 3 && x < sizeY - (CorrectY + 1) && x != 0 && Count <= Summ)
                        result[Count++] = array[sizeY - (x + 1)][CorrectY];
                }
            }
            sizeY--;
            sizeX--;
            CorrectY += 1;
            CorrectX += 1;
        }

        return result;
    }
}