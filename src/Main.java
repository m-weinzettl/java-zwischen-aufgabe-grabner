import Controller.Park;
import Models.*;

class Main{
        public static void main(String[] args) {

            Bike bike_1 = new Bike("Grün", 20, 7);
            Lkw lkw_1 =  new Lkw("Weiß", 120, 18);
            Pkw pkw_1 = new Pkw("Skoda Racing Blue", 55, 7);

            Park<Vehicle> park = new Park<>();

            park.add_vehicle(lkw_1);
            park.add_vehicle(pkw_1);
            park.add_vehicle(bike_1);

            park.zeige_vehicles();
            park.vehicle_tanken();
    }
}

/*

interface +
vererbung +
polymorphismus +
array list / linked list / hach map was ist besser hash set +
try except immer verwenden (selbst oder fertige?) +
records +
komposition (passt nicht zum aktuellen programm, wird nur theorie gelernt)
generics +
jdbc db ()
lambda ()
unity testing ()
multi threating ()

 */