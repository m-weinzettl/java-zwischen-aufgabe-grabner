package Vehicle;

abstract class Vehicle {
    protected int km_stand;
    protected int tank_groesse;
    protected double verbrauch_pro_100km;
    protected double treibstoff_verbraucht;
    protected int gefahrene_km;
    protected int zustand; // 1 = ganz, 0 = defekt
    protected String farbe;

    public String getAusstattung() {
        return ausstattung;
    }

    protected String ausstattung;

    public abstract void fahre(int strecke);
    public void set_zustand(){
        zustand = 1;
    }

    public int getTank_groesse() {
        return tank_groesse;
    }

    public void setTank_groesse(int tank_groesse) {
        this.tank_groesse = tank_groesse;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

// Print Ausgabe für die Fahrzeuge
    @Override
    public String toString() {
        return "Typ: " + this.getClass().getSimpleName() +
                " | Farbe: " + farbe +
                " | KM-Stand: " + km_stand +
                " | Zustand: " + (zustand == 1 ? "Ganz" : "Defekt");
    }
}

/*
class attribute
    km stand
    tank größe
    verbrauch/100km
    treibstoff verbraucht
    gefahrene km
    zustand (ganz (1) / defekt (0))
    farbe
    austattung

 */