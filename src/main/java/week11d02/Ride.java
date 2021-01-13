/*A feladatban egy biciklis futár egy heti munkáját rögzítjük és készítünk statissztikákat.
A futár minden fuvar után feljegyzi, hogy a hét hányadik napján történt a fuvar. Ezután azt, hogy az adott nap
hányadik fuvarját teljesítette és ezután azt, hogy hány kilométer volt az adott fuvar.
A futár egy-egy fuvarját reprezentálja a `Ride` nevű osztály, adatagokkal, konstruktorra, getterekkel.
Készítsd el a `Courier` osztályt. Ez fogja a futárt reprezentálni. Legyen egy rides listája
ami fuvarokat tárol. Legyen egy addRide metódus, ami csak sorrendben enged hozzáadni elemeket a listához.
Figyeljünk viszont arra, hogy nem feltétlenül minden nap dolgozott a futár, de ha már bekerült egy
3. napi fuvar, akkor ne kerülhessen be egy 2. napi. És arra is figyelj, hogy a napon belül is sorrendben
kerüljenek be az adatok. Ha a paraméterül kapott Ride nem felel meg a feltételeknek dobjunk
`IllegalArgumentException`-t.   Készíts egy metódust, ami visszad egy napot amikor a futár nem dolgozott.
Ha több ilyen nap is van akkor a korábbit! */
package week11d02;

public class Ride {
    private final int day;
    private final int rideNr;
    private final double length;

    public Ride(int day, int rideNr, double length) {
        if (day < 1 || day > 7) {
            throw new IllegalArgumentException();
        }
        if (length <= 0) {
            throw new IllegalArgumentException();
        }
        if (rideNr < 1) {
            throw new IllegalArgumentException();
        }
        this.day = day;
        this.rideNr = rideNr;
        this.length = length;
    }

    public int getDay() {
        return day;
    }

    public int getRideNr() {
        return rideNr;
    }

    public double getLength() {
        return length;
    }
}

/*
public class Ride {
    private int workday;
    private int indexOfRide;
    private int rideInKm;

    public Ride(int workday, int indexOfRide, int rideInKm) {
        this.workday = workday;
        this.indexOfRide = indexOfRide;
        this.rideInKm = rideInKm;
    }

    public int getWorkday() {
        return workday;
    }

    public int getIndexOfRide() {
        return indexOfRide;
    }

    public int getRideInKm() {
        return rideInKm;
    }
}
*/
