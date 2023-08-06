public class NonSubscribersPassengers extends Passenger {
    private double discount;
    private boolean haveDiscount;

    public NonSubscribersPassengers(String name, String ID, Car reservedCar, double tripCost, boolean haveDiscount) {
        super(name, ID, reservedCar, tripCost);
        this.haveDiscount = haveDiscount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isHaveDiscount() {
        return haveDiscount;
    }

    public void setHaveDiscount(boolean haveDiscount) {
        this.haveDiscount = haveDiscount;
    }


    public double reserveTrip(Car car){
        if(isHaveDiscount()){
            setDiscount((double) 10/100);
            super.setTripCost(super.getTripCost()-(super.getTripCost()*getDiscount()));
        }
        super.getReservedCar().setCapacity(super.getReservedCar().getCapacity()-1);
        return super.getTripCost();
    }


    public void getInfoTrip(){
        System.out.print("The passenger info: the name is "+super.getName()+", Id is "+ super.getID()+"\n"
                +"The reserved car info: the code is "+getReservedCar().getCode() +"\n"
                + super.getReservedCar().getRoute().toString());
        if (isHaveDiscount())
            System.out.print(", the price after discount is "+ super.getTripCost());
    }
}

