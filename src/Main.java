import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
//        System.out.println("Result: " + new Solution().solutionMultiplesof3or5(10));
//        System.out.println("Result: " + new SquareDigit().squareDigits(9119));
//        System.out.println("Result: " + new Solution().getMiddle("Test"));
//        System.out.println("Result: " + new Solution().getMiddle("testing"));
//        System.out.println("Result: " + new Solution().getMiddle("middle"));
//        System.out.println("Result: " + new Solution().getMiddle("A"));
//        System.out.println("Result: " + new SpinWords().spinWords("Hey fellow warriors"));
//        System.out.println("Result: " + new SpinWords().spinWords("Welcome"));
//        System.out.println("Result: " + new Solution().filterList(List.of(1, 2, "aasf", "1", "123", 123)));

//        https://www.codewars.com/kata/5279f6fe5ab7f447890006a7/
//        System.out.println("Result: " + new PickPeaks().getPeaks(new int[] {1,2,3,6,4,1,2,3,2,1}));
//        System.out.println("Result: " + new PickPeaks().getPeaks(new int[] {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1}));

//        https://www.codewars.com/kata/54ff3102c1bad923760001f3/
//        System.out.println("Result: " + new Vowels().getCount("abracadabra"));

//        https://www.codewars.com/kata/541c8630095125aba6000c00/
//        System.out.println("Result: " + new DRoot().digital_root(493193));

//        https://www.codewars.com/kata/5467e4d82edf8bbf40000155/
//        System.out.println("Result: " + new DescendingOrder().sortDesc(123456789 ));

//        https://www.codewars.com/kata/5556282156230d0e5e000089/
//        System.out.println("Result: " + new Bio().dnaToRna("TTTT"));

//        https://www.codewars.com/kata/57f609022f4d534f05000024/
//        System.out.println("Result: " + new Solution().stray(new int[]{17, 17, 3, 17, 17, 17, 17}));

//        https://www.codewars.com/kata/5bb904724c47249b10000131/train/java
//        System.out.println("Result: " + TotalPoints.points(new String[]{"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"}));

//        https://www.codewars.com/kata/5b68c7029756802aa2000176/train/java
//        System.out.println("Result: " + EasyLogs.logs(10, 2, 3));

//        https://www.codewars.com/kata/5ab6538b379d20ad880000ab/train/java
//        System.out.println("Result: " + Solution.areaOrPerimeter(4,4));

//        https://www.codewars.com/kata/606b43f4adea6e00425dff42/train/java
//        System.out.println("Result: " + Solution.gridMap(e -> e + 1, new Integer[][] {{1,2,3,4},{5,6,7,8,9},{0,2,4}}));

//        https://www.codewars.com/kata/5ff50f64c0afc50008861bf0/train/java
//        System.out.println("Result: " + Solution.fourSeven(7));

//        https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java
//        System.out.println("Result: " + HumanReadableTime.makeReadable(86399));

//        https://www.codewars.com/kata/51c8e37cee245da6b40000bd/train/java
//        System.out.println("Result: " + StripComments.stripComments( "apples, pears # and bananas\n     grapes  1  \nbananas !apples", new String[] { "#", "!" }));

//        https://www.codewars.com/kata/52742f58faf5485cae000b9a/train/java
//        System.out.println("Result: " + TimeFormatter.formatDuration(321321));

//        https://www.codewars.com/kata/52774a314c2333f0a7000688/train/java
//        System.out.println(Solution.validParentheses("(())((()())())"));
//        System.out.println(Solution.validParentheses(")(()))"));

//        https://www.codewars.com/kata/57e5a6a67fbcc9ba900021cd/train/java
//        Solution.arrayToTree(new Int[] {17, 0, -4, 3, 15});

//        https://www.codewars.com/kata/55c6126177c9441a570000cc/train/java
//        System.out.println(WeightSort.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));

//        https://www.codewars.com/kata/555624b601231dc7a400017a/train/java
//        System.out.println(JosephusSurvivor.josephusSurvivor(7,3));

//        https://www.codewars.com/kata/536a155256eb459b8700077e/train/java
        //System.out.println(TheClockwiseSpiral.createSpiral(3));

//        https://www.codewars.com/kata/5a805d8cafa10f8b930005ba/train/java
//        System.out.println(CodeWarsMath.nearestSq(111));

//        https://www.codewars.com/kata/5a34b80155519e1a00000009/train/java
//        System.out.println(ZywOo.multipleOfIndex(new int[]{-56,-85,72,-26,-14,76,-27,72,35,-21,-67,87,0,21,59,27,-92,68}));

//        https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce/train/java
//        System.out.println(Kata.multiTable(5));

//        https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java

//        https://www.codewars.com/kata/534e01fbbb17187c7e0000c6/train/java
//        int[][] result = Spiralizor.spiralize(8);
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                System.out.print(result[i][j]);
//            }
//            System.out.println();
//        }

//        https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/java
//        ArrayList<int[]> list = new ArrayList<int[]>();
//        list.add(new int[] {10,0});
//        list.add(new int[] {3,5});
//        list.add(new int[] {2,5});
//        System.out.println(Metro.countPassengers(list));
//        System.out.println(Arge.nbYear(1000, 2.0, 50, 1214));
//        System.out.println(BitCounting.countBits(1234));

//        System.out.println(Kata.longToIP(2154959208L));

//        https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
//        System.out.println(CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));

//        https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
//        System.out.println(Persist.persistence(25));

//        https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java
        System.out.println(Solution.toCamelCase("the-stealth-warrior"));

    }
}


