package week05d02;

public class ChangeLetter {

    private static final String VOWELS = "aeiou";
    private static final String VOWELS_1 = "aeiouAEIOU";

    public String changeVowels0(String text) {
        //if (text == null) throw new IllegalArgumentException("text is null");
        //if (text.isBlank()) throw new IllegalArgumentException("text is empty");
        String replacedText = "";

        for (int i = 0; i < text.length(); i++) {
            if (VOWELS.indexOf(text.toLowerCase().charAt(i)) > -1) {
                replacedText += "*";
            } else {
                replacedText += text.charAt(i);
            }
        }
        return replacedText;
    }

    public String changeVowels1(String text) {

        String replacedText = text;
        for (int i = 0; i < text.length(); i++) {
            for (char c : VOWELS.toCharArray()) {
                if (c == text.toLowerCase().charAt(i)) {
                    replacedText = replacedText.replace(text.charAt(i), '*');
                }
            }
        }
        return replacedText;
    }

    public String changeVowels2(String text) {

        StringBuilder replacedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            String char_ = text.toLowerCase().substring(i, i + 1);
            if (VOWELS.contains(char_)) {
                replacedText.append('*');
            } else {
                replacedText.append(text.substring(i, i + 1));
            }
        }
        return replacedText.toString();
    }

    public String changeVowels3(String text) {
        for (char c : VOWELS_1.toCharArray()) {
            text=text.replace(c,'*');
        }
        return text;
    }

    public static void main(String[] args) {

        ChangeLetter changeLetter = new ChangeLetter();
        System.out.println(changeLetter.changeVowels0("AeIoUmnbvCxyaíűáéLKjhgfdsúőpztRWqóüö"));
        System.out.println(changeLetter.changeVowels1("AeIoUmnbvCxyaíűáéLKjhgfdsúőpztRWqóüö"));
        System.out.println(changeLetter.changeVowels2("AeIoUmnbvCxyaíűáéLKjhgfdsúőpztRWqóüö"));
        System.out.println(changeLetter.changeVowels3("AeIoUmnbvCxyaíűáéLKjhgfdsúőpztRWqóüö"));
    }
}
