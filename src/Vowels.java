public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        String search = "aeiou";
        for (char element :
                search.toCharArray()) {
            vowelsCount += str.chars().filter(ch -> ch == element).count();
        }
        return vowelsCount;
    }
}