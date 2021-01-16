package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> pendriveAll) {

        Pendrive bestPricePerCapacity = pendriveAll.get(0);

        for (int i = 1; i < pendriveAll.size(); i++) {
            bestPricePerCapacity = comparePricePerCapacity(pendriveAll, bestPricePerCapacity, i);
        }
        return bestPricePerCapacity;
    }

    private Pendrive comparePricePerCapacity(List<Pendrive> pendriveAll, Pendrive bestPricePerCapacity, int i) {
        if (pendriveAll.get(i).pricePerCapacity() < bestPricePerCapacity.pricePerCapacity()) {
            bestPricePerCapacity = pendriveAll.get(i);
        }
        return bestPricePerCapacity;
    }

    public Pendrive cheapest(List<Pendrive> pendriveAll) {

        Pendrive cheapest = pendriveAll.get(0);

        for (int i = 1; i < pendriveAll.size(); i++) {
            cheapest = cheapest(pendriveAll, cheapest, i);
        }
        return cheapest;
    }

    private Pendrive cheapest(List<Pendrive> pendriveAll, Pendrive cheapest, int i) {
        if (pendriveAll.get(i).getPrice() < cheapest.getPrice()) {
            cheapest = pendriveAll.get(i);
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendriveAll, int percent, int capacity) {
        for (Pendrive pendrive : pendriveAll) {
            if (pendrive.getCapacity() == capacity) {
                pendrive.risePrice(percent);
            }
        }
    }
}
