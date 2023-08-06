// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Route r=new Route("Jeddah","Riyadh",250.0);
        Route r1=new Route("Jeddah","Makkah",150.0);

        Car c=new Car("0123",r,4);
        Car c1=new Car("0124",r1,0);

        try {

        getCapacity(c.getCapacity());
        getCapacity(c1.getCapacity());
        Passenger[] p= {new SubscribersPassengers("Ahmed","01",c,c.getRoute().getTripPrice()),
                new NonSubscribersPassengers("Bashaer","02",c1,c1.getRoute().getTripPrice(),true)};

        p[0].reserveTrip(p[0].getReservedCar());
        p[1].reserveTrip(p[1].getReservedCar());

        for (int i = 0; i < p.length; i++) {
           p[i].getInfoTrip();
            System.out.println();
        }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void getCapacity(int capacity) throws Exception{
        if(capacity == 0)
            throw new Exception("sorry,the capacity of car equal Zero ");
    }


}