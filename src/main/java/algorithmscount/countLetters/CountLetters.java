package algorithmscount.countLetters;

public class CountLetters {

    public int countLetters(String str, char c) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                sum ++;
            }
        }
        return sum;
    }
}
