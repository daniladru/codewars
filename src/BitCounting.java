public class BitCounting {

    public static int countBits(int n){
        return (int) Integer.toBinaryString(n).chars().filter(x -> x=='1').count();
    }

}