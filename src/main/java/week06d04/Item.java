package week06d04;

import java.time.LocalDate;

public class Item {

    private int price;
    private int month;
    private String name;
    private LocalDate date;

    public Item(int price, int month, String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can not be blank.");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Ivalid month value.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }
        this.price = price;
        this.month = month;
        this.name = name;
    }

    /*public Item(int price, LocalDate date, String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can not be blank.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }
        this.price = price;
        this.date = date;
        this.name = name;
    }*/

    /*public Item(int price, int year,int month,int day, String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can not be blank.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }
        this.price = price;
        this.date = LocalDate.of(year,month,day);
        this.name = name;
    }*/

    public LocalDate getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", month=" + month +
                ", name='" + name + '\'' +
                '}';
    }
}
