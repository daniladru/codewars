public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hour = seconds / 3600;
        int minut = (seconds - hour * 3600) / 60;
        int second = seconds - hour * 3600 - minut * 60;
        return String.format("%02d", hour) + ":" + String.format("%02d", minut) + ":" + String.format("%02d", second);
    }
}