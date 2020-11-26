package week05d04;

import java.time.LocalDate;

public class Product {
    //Mai feladat Junior/Mid-Level:
    //Készíts egy week05d04.Product osztályt melyben egy termékről tárolod a nevét és a lejárati dátumát (LocalDate).
    // Legyen egy konstruktora, ami a nevet kapja meg illetve a lejárati dátumot három részletben int year, int month, int day.
    // (public Product(String name, int year, int month, int day))
    //A lejárati dátumot a konstruktorban állítsd össze.
    //Legyen mindkettőhöz getter metódus.
    //Készíts egy week05d04.Store osztályt, melyben van egy Productokat tároló lista. Legyen benne egy addProduct(Product) metódus.
    //Bónusz1: Legyen benne egy getNumberOfExpired() metódus ami visszaadja a lejárt termékek számát. Használd a LocalDate.now() és az isBefore() metódusokat.
    //Bónusz2: Csak akkor engedj hozzáadni terméket, ha nem járt le és a neve még nem szerepel a listában.
    //Ha sikerül hozzáadni akkor true-val térjen vissza, ha nem akkor false.
    // Tesztelj! (edited)

    private String name;
    private LocalDate expirationDay;

    public Product(String name, int year, int month, int day) {
        this.expirationDay = LocalDate.of(year, month, day);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpirationDay() {
        return expirationDay;
    }

    public boolean isExpired() {
        if (expirationDay.isBefore(LocalDate.now())) {
            return true;
        }
        return false;
    }
}
