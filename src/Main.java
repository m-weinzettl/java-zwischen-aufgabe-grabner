import Vehicle.*;
import java.util.LinkedList;

class Main{
        public static void main(String[] args) {

            Bike bike_1 = new Bike("Blau", 23, 8);
            Lkw lkw_1 = new Lkw("Weiss", 150, 23);
            Pkw pkw_1 = new Pkw("Blau", 55, 6);

            LinkedList<String> cars = new LinkedList<String>();
            cars.add(bike_1.toString());
            cars.add(lkw_1.toString());
            cars.add("Ford");
            cars.add("Mazda");
            System.out.println(cars);
    }
}

/*

interface
vererbung
polymorphismus
array list / linked list / hach map was ist besser hash set
try except immer verwenden (selbst oder fertige?)
generics ()
lambda ()
jdbc db ()
multi threating ()

 */