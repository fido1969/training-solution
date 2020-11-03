package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(16.5, false);

        System.out.println(distance.getDistanceInKm() + " " + distance.isExact());

        int intPart = (int) distance.getDistanceInKm();

        System.out.println(intPart);
    }
}
