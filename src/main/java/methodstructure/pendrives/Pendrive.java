package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void risePrice(int percent) {
        this.price += this.price * (percent / 100.0);
    }

    public int comparePricePerCapacity(Pendrive otherPendrive) {
        if (pricePerCapacity() > otherPendrive.pricePerCapacity()) {
            return 1;
        } else if (pricePerCapacity() < otherPendrive.pricePerCapacity()) {
            return -1;
        }
        return 0;
    }

    public double pricePerCapacity() {
        return (double) (this.getPrice() / this.getCapacity());
    }

    public boolean cheaperThan(Pendrive otherPendrive) {
        return this.getPrice() < otherPendrive.getPrice();
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
