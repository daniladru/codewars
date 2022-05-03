public class TheClockwiseSpiral {
    public static int[][] createSpiral(int N) {
        int[][] result = new int[N][N];
        int Summ = N * N;
        int sizeY = N;
        int sizeX = N;
        int CorrectY = 0;
        int CorrectX = 0;
        int Count = 1;
        while (sizeY > 0) {
            for (int y = 0; y < 4; y++) {
                for (int x = 0; x < ((sizeX < sizeY) ? sizeY : sizeX); x++) {
                    if (y == 0 && x < sizeX - CorrectX && Count <= Summ)
                        result[y + CorrectY][x + CorrectX] = Count++;
                    if (y == 1 && x < sizeY - CorrectY && x != 0 && Count <= Summ)
                        result[x + CorrectY][sizeX - 1] = Count++;
                    if (y == 2 && x < sizeX - CorrectX && x != 0 && Count <= Summ)
                        result[sizeY - 1][sizeX - (x + 1)] = Count++;
                    if (y == 3 && x < sizeY - (CorrectY + 1) && x != 0 && Count <= Summ)
                        result[sizeY - (x + 1)][CorrectY] = Count++;
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