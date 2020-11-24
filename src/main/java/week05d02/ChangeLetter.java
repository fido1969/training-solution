package week05d02;

public class ChangeLetter {

    private static final String VOWELS = "aeiou";

    public String changeVowels(String text) {
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

    public static void main(String[] args) {

        ChangeLetter changeLetter = new ChangeLetter();
        System.out.println(changeLetter.changeVowels("AeIoUmnbvCxyíűáéLKjhgfdsúőpztRWqóüö"));
        System.out.println(changeLetter.changeVowels("AeIoUmnbvCxyíűáéLKjhgfdsúőpztRWqóüö"));
    }
}
