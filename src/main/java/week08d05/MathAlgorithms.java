package week08d05;

import java.util.ArrayList;
import java.util.List;

public class MathAlgorithms {
    //# Junior
    //A week08d05 csomagban készíts egy osztályt MathAlgorithms néven. Legyen benne egy metódus,
    // greatestCommonDivisor(), ami paraméterül vár két pozitív egész számot és visszaadja a
    // legnagyobb közös osztójukat.

    int greatestCommonDivisor(int a, int b) {
        List<Integer> divisor = getCommonDivisors(a, b);
        int greatestDivisor = 1;
        for (int i = 1; i < divisor.size(); i++) {
            if (divisor.get(i) > greatestDivisor) {
                greatestDivisor = divisor.get(i);
            }
        }
        return greatestDivisor;
    }

    private List<Integer> getCommonDivisors(int a, int b) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public int greatestCommonDivisorEuclidean(int a, int b) {
        while (b != 0) {
            int temporary = b;
            b = a % b;
            a = temporary;
        }
        return a;
    }

    public int greatestCommonDivisorEuclideanOther(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        System.out.println(mathAlgorithms.greatestCommonDivisor(15, 90));

        System.out.println(mathAlgorithms.greatestCommonDivisorEuclidean(15, 90));

        System.out.println(mathAlgorithms.greatestCommonDivisorEuclideanOther(7, 3));
    }
}

