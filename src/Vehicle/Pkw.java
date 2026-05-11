package Vehicle;
import Interfaces.*;

public class Pkw extends Vehicle implements Tanken ,Km_Ablesen {
    private boolean anhaenger;

    public Pkw(String farbe, int tank_groesse, double verbrauch){
        this.farbe = farbe;
        this.tank_groesse = tank_groesse;
        this.verbrauch_pro_100km = verbrauch;
        this.zustand = 1;

    }

    @Override
    public void tanken(int menge) {
        this.treibstoff_verbraucht -= menge;
        if (this.treibstoff_verbraucht < 0) this.treibstoff_verbraucht = 0;
        System.out.println("Es wurde " + menge + " getankt.");

    }

    @Override
    public void fahre(int strecke) {
        this.gefahrene_km += strecke;
        this.km_stand += strecke;
        double verbrauch = (strecke / 100.0) * this.verbrauch_pro_100km;
        this.treibstoff_verbraucht += verbrauch;
        System.out.println("Es wurden " + " Km gefahren.");

    }

    @Override
    public void ablesen(int neuer_tacho_stand) {
        if (neuer_tacho_stand >= this.km_stand) {
            this.gefahrene_km = neuer_tacho_stand - this.km_stand;
            this.km_stand = neuer_tacho_stand;
            System.out.println("Fahrzeug erfolgreich abgelesen. Strecke dieser Fahrt: " + this.gefahrene_km + " km.");
        } else {
            System.out.println("Fehler: Der neue Tachostand ist niedriger als der alte!");
        }
    }
}

