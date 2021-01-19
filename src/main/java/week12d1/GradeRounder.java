//Mai junior/medior feladat:Készíts egy GradeRounder osztályt, amiben van egy int[] roundGrades(int[] grades)
//metódus. A grades tömb pontszámokat tartalmaz 0 és 100 között. A feladat az, hogy kerekítsük a benne lévő számokat
//a következő szabály szerint: Ha a pontszám és az 5 következő többszöröse közötti különbség kisebb, mint 3, akkor
//kerekítsük fel a számot az 5 következő többszörösére. Fontos: a 40 pont alatti pontszámok elégtelenek, ezeket
//egyáltalán nem kell kerekíteni. Példa: a pontszám 84. 85 - 84 kevesebb mint 3, így felfelé kerekítünk.

package week12d1;

public class GradeRounder {

    public int[] roundGrades(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 0 || grades[i] > 100) {
                throw new IllegalArgumentException("Non valid numbers");
            } else if (grades[i] >= 40 && grades[i] % 5 > 2) {
                grades[i] += (5 - grades[i] % 5);
            }
        }
        return grades;
    }

    public int[] roundGrades1(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 0 || grades[i] > 100) {
                throw new IllegalArgumentException("Non valid numbers");
            } else if (grades[i] >= 40) {
                int floor = grades[i] / 5;
                int next = (floor + 1) * 5;
                if (next - grades[i] < 3) {
                    grades[i] = next;
                }
            }
        }
        return grades;
    }

}
