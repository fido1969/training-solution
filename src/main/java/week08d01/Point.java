package week08d01;
//Junior/Mid-leve csoport mai feladata:
//A feladatban egy robot mozgását fogjuk szimulálni. Képzelj el egy koordináta rendszert, ahol a robot az origóban van.
// A robot négy irányba képes mozogni fel, le, balra és jobbra. A week08d01.Robot osztályban írj egy
// move() metódust ami egy karaktersorozatot vár.  pl: FFLLLLLBBBBJJJJJJJ, ahol az F = fel, L=le, B=bal, J=jobb.
// A metódus visszatérési értéke legyen a robot mozgás utáni pozíciója. A feladat szabadon bővíthető osztályokkal
// és metódusokkal. Bónusz kiegészítés, hogyha más karaktert is tartalmaz a paraméter String nem csak a
// FLBJ valamelyikét, akkor dobjunk IllegalArgumentExceptiont!

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void increaseX(){
        x++;
    }
    public void decreaseX(){
        x--;
    }
    public void increaseY(){
        y++;
    }
    public void decreaseY(){
        y--;
    }
}
