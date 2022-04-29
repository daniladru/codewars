public class TimeFormatter {
    static int countNotZero;
    static int countCurentPosition;

    static String addResult(int value, String valueOne, String valueMany) {
        String result = "";
        if (value == 0) {
            return result;
        }
        countCurentPosition++;
        if (countCurentPosition > 1) {
            if (countCurentPosition < countNotZero) {
                result += ", ";
            } else {
                result += " and ";
            }
        }
        result += String.format("%d", value);
        result += (value == 1) ? " " + valueOne : " " + valueMany;
        return result;
    }

    public static String formatDuration(int seconds) {
        System.out.println(seconds);
        if (seconds == 0) {
            return "now";
        }

        Integer years = seconds / (365 * 24 * 3600);
        Integer days = (seconds - years * (365 * 24 * 3600)) / (24 * 3600);
        Integer hours = (seconds - years * (365 * 24 * 3600) - days * 24 * 3600) / (3600);
        Integer minutes = (seconds - years * (365 * 24 * 3600) - days * 24 * 3600 - hours * 3600) / 60;
        Integer second = seconds - years * (365 * 24 * 3600) - days * 24 * 3600 - hours * 3600 - minutes * 60;

        countNotZero = 0;
        if (years != 0) {
            countNotZero++;
        }
        if (days != 0) {
            countNotZero++;
        }
        if (hours != 0) {
            countNotZero++;
        }
        if (minutes != 0) {
            countNotZero++;
        }
        if (second != 0) {
            countNotZero++;
        }

        countCurentPosition = 0;

        String result = addResult(years, "year", "years") + addResult(days, "day", "days") + addResult(hours, "hour", "hours") + addResult(minutes, "minute", "minutes") + addResult(second, "second", "seconds");

        return result;
    }
}