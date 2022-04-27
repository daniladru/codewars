public class SquareDigit {
    public int squareDigits(int n) {
        String result = "";
        for (char ch : Integer.toString(n).toCharArray()) {
            result += (int) Math.pow(Character.getNumericValue(ch), 2);
        }
        return Integer.parseInt(result);
    }
}
