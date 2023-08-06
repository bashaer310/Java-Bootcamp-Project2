public abstract class Passenger {
    private String name, ID;
    private Car reservedCar;
    private double tripCost;

    public Passenger(String name, String ID, Car reservedCar, double tripCost) {
        this.name = name;
        this.ID = ID;
        this.reservedCar = reservedCar;
        this.tripCost = tripCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public abstract double reserveTrip(Car car);


    public void getInfoTrip(){
        System.out.println("The passenger info: the name is "+getName()+", Id is "+ getID()+"\n"
        +"The reserved car info: the code is "+getReservedCar().getCode() +"\n"
        + getReservedCar().getRoute().toString());
    }
}
