package Models;
import Interfaces.*;

public class Lkw extends Vehicle implements Tanken, Km_Ablesen {
    public boolean fracht;

    public Lkw(String farbe, String kennzeichen, int tank_groesse, double verbrauch){
        this.set_kennzeichen(get_kennzeichen());
        this.farbe = farbe;
        this.tank_groesse = tank_groesse;
        this.verbrauch_pro_100km = verbrauch;
        this.zustand = 1;
    }
}
