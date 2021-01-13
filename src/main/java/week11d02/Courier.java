package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {
    private final List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        if (isAddable(ride)) {
            rides.add(ride);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int firstFreeDay() {
        boolean freeDay = true;
        for (int day = 1; day <= 7; day++) {
            for (Ride item : rides) {
                if (item.getDay() == day) {
                    freeDay = false;
                    break;
                }
            }
            if (freeDay) {
                return day;
            }
            freeDay = true;
        }
        return -1;
    }

    private boolean isAddable(Ride ride) {
        int last = rides.size() - 1;
        if (ride == null) {
            return false;
        }
        if (rides.isEmpty()) {
            return ride.getRideNr() == 1;
        }
        if (rides.get(last).getDay() > ride.getDay()) {
            return false;
        }
        if (rides.get(last).getDay() == ride.getDay()) {
            if (rides.get(last).getRideNr() >= ride.getRideNr()) {
                return false;
            } else if (rides.get(last).getRideNr() == ride.getRideNr() - 1) {
                return true;
            }
        }
        return ride.getRideNr() == 1;
    }
}

/*import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        if (rides.size() == 0 || valid(ride)) {
            rides.add(ride);
            return;
        }
        throw new IllegalArgumentException("Invalid input!");
    }

    private boolean valid(Ride ride) {
        Ride lastRide = rides.get(rides.size() - 1);

        if (lastRide.getWorkday() < ride.getWorkday() && ride.getIndexOfRide() == 1) {
            return true;
        }
        if (lastRide.getWorkday() == ride.getWorkday() && lastRide.getIndexOfRide() + 1 == ride.getIndexOfRide()) {
            return true;
        }
        return false;
    }

    public int getNonWorkDay() {
        if (rides.get(0).getWorkday() > 1) {
            return 1;
        }
        for (int i = 1; i < rides.size(); i++) {
            if ((rides.get(i).getWorkday() - rides.get(i - 1).getWorkday()) > 1) {
                return rides.get(i - 1).getWorkday() + 1;
            }
        }
        return -1;
    }

}*/

