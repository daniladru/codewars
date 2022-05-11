class Kata {
    public static String multiTable(int num) {
        String[] result = new String[10];
        for (int i = 1; i <=10 ; i++) {
            result[i-1] = "" + i + " * " + num + " = " + i*num;
        }
        return String.join("\n",result); // good luck
    }
    public static String longToIP(long ip) {
        String[] ipParts = {"","","",""};
        StringBuilder sb = new StringBuilder(Long.toBinaryString(ip));
        int addCount = 32 - sb.length();
        for (int i = 0; i < addCount; i++) {
            sb.insert(0,"0");
        }
        for (int i = 0; i < 4; i++) {
            ipParts[i] = String.valueOf(Integer.parseInt(sb.substring(i*8,(i+1)*8),2));
        }
        return String.join(".",ipParts);
    }

}

