package week07d01;

public class MathAlgorithms {
    //Junior/Mid-Level csoport mai feladata:
    //Készíts egy osztályt a week07d01 csomagba MathAlgorithms néven. Ebben az osztályban legyen egy isPrime(int x)
    //metódus ami a paraméterül kapott számról eldönti, hogy prím-e vagy sem és ennek megfelelően
    // true vagy false értékkel tér vissza. Aki már tart ott és tudja mit jelent a static az nyugodtan
    // implementálhatja a metódust statikus metódusként. Az egyszerűség kedvért a prímeket most csak a
    // pozitív egész számok körében értelmezzük, így bónuszként rá lehet ellenőrizni, hogy x>0
    // és ha nem akkor kivételt dobni. Prímeknek tekintjük azokat számokat melyek csak egyel
    // és önmagukkal oszthatók, tehát a 2,3,5,7,11,13 stb. Teszt!!

    public static boolean isPrime(int x) {

        if (x < 1) {
            throw new IllegalArgumentException("Wrong parameter!");
        }

        if (x == 1) {
            return false;
        }

        if (x == 2) {
            return true;
        }

        for (int j = 2; j <= Math.sqrt(x); j++) {
            if (x % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeOtherWay(int x) {

        if (x < 1) {
            throw new IllegalArgumentException("Wrong parameter!");
        }

        int divisor = 0;

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                divisor++;
            }
        }
        if (divisor == 2) {
            return true;
        }
        return false;
    }

    /*public static void main(String[] args) {

        System.out.println(MathAlgorithms.isPrime(12));
        System.out.println(MathAlgorithms.isPrime(7));

        try {
            MathAlgorithms.isPrime(-56);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }*/
}
