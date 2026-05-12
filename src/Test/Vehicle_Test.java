package Test;
import Models.Pkw;
import Models.Strafzettel;
import Controller.Park;
import Models.Vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Vehicle_Test {

    @Test
    public void vehicle_test_tanken() {
        Pkw pkw_0 = new Pkw("Braun", "LB-1234", 65, 6.6);

        pkw_0.fahre(120);
        double inhalt_nach_fahrt = pkw_0.aktueller_tankinhalt();

        pkw_0.tanken(5);

        assertEquals(inhalt_nach_fahrt + 5, pkw_0.aktueller_tankinhalt(), 0.01);

    }

    @Test
    public void strafe_test(){
        Park<Vehicle> teste_park = new Park<>();
        Strafzettel zettel = teste_park.strafe_zu_schnell_gefahren();

        assertEquals(120, zettel.strafe(), 0.01);
    }


    @Test
    void testZustandDefault() {
        Pkw pkw_4 = new Pkw("Rot", "LB-1232", 55, 7);
        assertEquals(1, pkw_4.get_zustand());
    }
}
