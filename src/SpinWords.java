public class SpinWords {
    public String spinWords(String sentence) {
        String result = "";
        for (String word : sentence.split(" ")) {
            if (word.length() > 4) {
                word = new StringBuilder(word).reverse().toString();
            }
            result += (result.length() == 0) ? "" : " ";
            result += word;
        }
        return result;
    }
}
