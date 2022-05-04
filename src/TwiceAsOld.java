public class TwiceAsOld {
    public static int TwiceAsOld(int dadYears, int sonYears) {
        int delta = dadYears - sonYears;
        return Math.abs(delta * 2 - dadYears);


    }
}