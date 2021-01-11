//Mai junior/mid-level feladat: Készítsünk egy DivisorFinder nevű osztályt, melynek van egy
// int findDivisors(int n) metódusa. A feladat az, hogy megnézzük a szám minden egyes számjegyére,
// hogy osztója-e a számnak, majd számoljuk össze őket. Példa: a 425-ben az 5 osztója a számnak,
// ezért a visszatérési érték 1.
package week11d01;

public class DivisorFinder {

    int findDivisors(int n) {
        if (n==0){
            throw new ArithmeticException("/ by zero!");
        }

        if (n<0){
            throw new NumberFormatException();
        }

        int sumDivisors = 0;

        String number = Integer.toString(n);

        String[] numbers = number.split("");

        for (int i = 0; i < numbers.length; i++) {
            if (n % Integer.parseInt(numbers[i]) == 0) {
                sumDivisors++;
            }
        }
        return sumDivisors;
    }
}

