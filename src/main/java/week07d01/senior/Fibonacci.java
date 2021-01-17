//Készíts egy osztályt Fibonacci néven! Legyen benne egy fib metódus, ami egy int n paramétert vár!
//A visszatérési értékünk legyen egy long szám, ami az n-edik fibonacci számot tartalmazza.
//(A fibonacci szám az az az előző kettő fibonacci szám összege és az első két szám az 1, 1.
//Bónusz feladat: implementáld az algoritmust ciklus nélkül és mentsd el a részeredményeket egy statikus változóba!
//Pontosítás: Ha n = 0, akkor 0-t adunk vissza, ha n = 1, akkor 1-et, ezért lesz a 2. elem szintén 1,mert 0 + 1 = 1

package week07d01.senior;

public class Fibonacci {

    public static long fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Counter can't be less then 0");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        if (RESULTS[n] == null) {
            RESULTS[n] = fib(n - 2) + fib(n - 1);
            System.out.println(RESULTS[n]);
        }
        return RESULTS[n];
    }

    private static final Long[] RESULTS = new Long[1024];

    public static void main(String[] args) {
        fib(10);
    }
}
