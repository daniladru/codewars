class Kata {
    public static String multiTable(int num) {
        String[] result = new String[10];
        for (int i = 1; i <=10 ; i++) {
            result[i-1] = "" + i + " * " + num + " = " + i*num;
        }
        return String.join("\n",result); // good luck
    }
}