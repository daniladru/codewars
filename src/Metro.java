import java.util.ArrayList;

class Metro {

//    public static int countPassengers(ArrayList<int[]> stops) {
//        int resutl =0;
//        for (int[] element :
//                stops) {
//            resutl += (element[0]-element[1]);
//
//        }
//        return resutl;
//    }

    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream().mapToInt(p -> p[0] -p[1]).sum();
    }

}