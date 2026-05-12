package Models;

import Interfaces.*;

public abstract class Vehicle implements Km_Ablesen, Tanken {
    protected int km_stand;
    protected int tank_groesse;
    protected double verbrauch_pro_100km;
    protected double treibstoff_verbraucht;
    protected int gefahrene_km;
    protected int zustand; // 1 = ganz, 0 = defekt
    protected String farbe;
    protected String ausstattung;
    //mehr mit private (package)

    // Getter und Setter
    public String getAusstattung() { return ausstattung; }
    public void set_zustand() { zustand = 1; }
    public int getTank_groesse() { return tank_groesse; }
    public void setTank_groesse(int tank_groesse) { this.tank_groesse = tank_groesse; }
    public String getFarbe() { return farbe; }
    public void setFarbe(String farbe) { this.farbe = farbe; }


    @Override
    public void tanken(int menge) {
        this.treibstoff_verbraucht -= menge;
        if (this.treibstoff_verbraucht < 0) this.treibstoff_verbraucht = 0;
        System.out.println("Es wurde " + menge + " getankt.");
    }

    public void voll_tanken() {
        double menge_bis_voll = this.treibstoff_verbraucht;
        if (menge_bis_voll > 0) {
            tanken((int)menge_bis_voll);
            System.out.println("Das Fahrzeug wurde vollgetankt.");
        } else {
            System.out.println("Der Tank ist bereits voll.");
        }
    }

    public void fahre(int strecke) {
        this.gefahrene_km = strecke;
        this.km_stand += strecke;
        double verbrauch = (strecke / 100.0) * this.verbrauch_pro_100km;
        this.treibstoff_verbraucht += verbrauch;
        System.out.println(this.getClass().getSimpleName() + ": Es wurden " + strecke + " Km gefahren.");
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


    public double aktueller_tankinhalt() {
        return this.tank_groesse - this.treibstoff_verbraucht;
    }

    @Override
    public String toString() {
        return "Typ: " + this.getClass().getSimpleName() +
                " | Farbe: " + farbe +
                " | KM-Stand: " + km_stand +
                " | Zustand: " + (zustand == 1 ? "Ganz" : "Defekt");
    }
}