import Park.Park;
import Vehicle.*;
import java.util.LinkedList;

class Main{
        public static void main(String[] args) {

            Bike bike_1 = new Bike("Grün", 20, 7);
            Lkw lkw_1 =  new Lkw("Weiß", 120, 18);
            Pkw pkw_1 = new Pkw("Skoda Racing Blue", 55, 7);

            Park mein_park = new Park();

            mein_park.add_vehicle(lkw_1);
            mein_park.add_vehicle(pkw_1);
            mein_park.add_vehicle(bike_1);

            mein_park.zeige_vehicles();
    }
}

/*

interface +
vererbung +
polymorphismus +
array list / linked list / hach map was ist besser hash set +
try except immer verwenden (selbst oder fertige?) +
generics ()
lambda ()
jdbc db ()
multi threating ()

 */