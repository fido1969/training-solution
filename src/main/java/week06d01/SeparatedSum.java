package week06d01;

public class SeparatedSum {
    //Senior feladat: Írj egy week06d01.SeparatedSum.sum(String s) metódust, mely kap egy String-et,
    // melyben lebegőpontos számok szerepelnek pontosvesszővel elválasztva.
    // A számoknál vessző a tizedeselválasztó. Ezt szétszedi, és összeadja külön a pozitív és külön
    // a negatív számokat. Mivel térnél vissza ebből a metódusból? Tesztesetet el ne felejtsd!
    // "56,67;6,8;3;-12;-16,7" (edited)

    /*Saját jó megoldás
    public SumResult sum(String s) {
        double positive = 0;
        double negative = 0;
        String replaced = s.replace(",", ".");
        String[] parts = replaced.split(";");
        for (String part : parts) {
            double value = Double.parseDouble(part);
            if (value > 0) {
                positive += value;
            } else {
                negative += value;
            }
        }
        return new SumResult(positive, negative);
    }*/


    //utólag hozom létre
    public static final String SOURCE_SIGN = ",";
    public static final String TARGET_SIGN = ".";
    public static final String NUMBER_SEPARATOR = ";";
         // Alt+Enter --> a kijelölt SumResult-on létrehozhatom az osztályt utólag
    public SumResult sum(String s) {
        if (s == null|| s.isBlank()){
            throw new IllegalArgumentException("The text can not be null or blank");
        }
        double positive = 0;
        double negative = 0;
                                 // a kijelölt (",") jobb click --> refactor-->introduce constant
        String replaced = s.replace(SOURCE_SIGN, TARGET_SIGN);
        String[] parts = replaced.split(NUMBER_SEPARATOR);
        for (String part : parts) {
            try {
            double value = Double.parseDouble(part);
            if (value > 0) {
                positive += value;
            } else {
                negative += value;
            }
            }catch (NumberFormatException e){
                throw new IllegalArgumentException("Wrong format double string!");
            }
        }
        return new SumResult(positive, negative);
    }

    public static void main(String[] args) {
        SumResult result = new SeparatedSum().sum("56,67;6,8;3;-12;-16,7");
        System.out.println(result);



       /*Scanner scanner = new Scanner("56,67;6,8;3;-12;-16,7".replace(",","."));
        scanner.useDelimiter(";");
        scanner.useLocale(new Locale("en","US"));
        while (scanner.hasNext()){
            double d =scanner.nextDouble();
            System.out.println(d);
        }*/
    }
}
