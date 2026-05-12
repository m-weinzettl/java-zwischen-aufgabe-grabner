package Models;
import Interfaces.*;

public class Pkw extends Vehicle implements Tanken ,Km_Ablesen {
    private boolean anhaenger;

    public Pkw(String farbe, String kennzeichen, int tank_groesse, double verbrauch){
        this.set_kennzeichen(get_kennzeichen());
        this.farbe = farbe;
        this.tank_groesse = tank_groesse;
        this.verbrauch_pro_100km = verbrauch;
        this.zustand = 1;
    }
}

