public class Route {

    private String departureAddress, destinationAddress;
    private double tripPrice;

    public Route(String departureAddress, String destinationAddress, double tripPrice) {
        this.departureAddress = departureAddress;
        this.destinationAddress = destinationAddress;
        this.tripPrice = tripPrice;
    }

    public String getDepartureAddress() {
        return departureAddress;
    }

    public void setDepartureAddress(String departureAddress) {
        this.departureAddress = departureAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    @Override
    public String toString() {
        return "The rout info: from " + getDepartureAddress() + ", to " + getDestinationAddress() + ", the price of ticket is " + getTripPrice();
    }
}
