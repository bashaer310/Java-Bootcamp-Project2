public class SubscribersPassengers extends Passenger {

    private double discount;

    public SubscribersPassengers(String name, String ID, Car reservedCar, double tripCost) {
        super(name, ID, reservedCar, tripCost);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double reserveTrip(Car car){

        setDiscount((double) 50/100);
        super.setTripCost(super.getTripCost()-(super.getTripCost()*getDiscount()));
        super.getReservedCar().setCapacity(super.getReservedCar().getCapacity()-1);
        return super.getTripCost();
    }


    public void getInfoTrip(){
        System.out.println("The passenger info: the name is "+super.getName()+", the Id is "+ super.getID()+"\n"
                +"The reserved car info: the code is "+getReservedCar().getCode() +"\n"
                + super.getReservedCar().getRoute().toString() + ", the price after discount is "+ super.getTripCost());
    }

}
