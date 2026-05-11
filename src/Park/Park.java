package Park;

import Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Park {

    private List<Vehicle> vehicles;

    public Park() {
        this.vehicles = new LinkedList<>();
    }

    public void add_vehicle(Vehicle vehicle) {
        try {

            if (vehicle != null) {
                this.vehicles.add(vehicle);
                System.out.println(vehicle.getClass().getSimpleName() + " wurde dem Park hinzugefügt.");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void zeige_vehicles() {
        System.out.println("Fahrzeuge im Park: ");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}

