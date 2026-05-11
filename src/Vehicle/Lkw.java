package Vehicle;
import Interfaces.*;

public class Lkw extends Vehicle implements Tanken, Km_Ablesen {
    public boolean fracht;

    public Lkw(String farbe, int tank_groesse, double verbrauch){
        this.farbe = farbe;
        this.tank_groesse = tank_groesse;
        this.verbrauch_pro_100km = verbrauch;
        this.zustand = 1;

    }
}
