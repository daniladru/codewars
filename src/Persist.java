class Persist {
    static long getMultiply(long n) {
        long result = 1;
        for (char ch : Long.toString(n).toCharArray()) {
            result = result * Long.parseLong(String.valueOf(ch));
        }
        return result;
    }

    public static int persistence(long n) {
        int count = 0;
        if (n < 10) {
             return count;
        }

        long curentN = getMultiply(n);
        count++;
        while (curentN > 9) {
            count++;
            curentN = getMultiply(curentN);
        }
        return count;
    }
}