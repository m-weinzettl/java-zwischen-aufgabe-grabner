package Models;
import Interfaces.*;

public class Pkw extends Vehicle implements Tanken ,Km_Ablesen {
    private boolean anhaenger;

    public Pkw(String farbe, int tank_groesse, double verbrauch){
        this.farbe = farbe;
        this.tank_groesse = tank_groesse;
        this.verbrauch_pro_100km = verbrauch;
        this.zustand = 1;
    }
}

