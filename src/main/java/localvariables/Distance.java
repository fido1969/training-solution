package localvariables;

public class Distance {

    private Double distanceInKm;

    private Boolean exact;

    public Distance(Double distanceInKm, Boolean exact) {
        this.distanceInKm = distanceInKm;
        this.exact = exact;
    }

    public Double getDistanceInKm() {
        return distanceInKm;
    }

    public Boolean isExact() {
        return exact;
    }
}
