package Park;

import Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Park {
    Scanner scanner = new Scanner(System.in);

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

    public void vehicle_tanken() {
        if (vehicles.isEmpty()) {
            System.out.println("Der Park ist leer.");
            return;
        }

        System.out.println("Verfügbare Fahrzeuge:");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + vehicles.get(i).toString());
        }

        System.out.println("Geben Sie die Nummer des Fahrzeugs ein:");

        try {
            int wahl = Integer.parseInt(scanner.nextLine());
            int index = wahl - 1;

            Vehicle diese_vehicle = vehicles.get(index);

            System.out.println("Der aktuelle Tankinhalt ist: " + diese_vehicle.aktueller_tankinhalt());

            System.out.println("(V)oll tanken oder nur einen (T)eil?");
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("v")) {
                diese_vehicle.voll_tanken();
            } else {
                System.out.println("Wie viel Liter sollen getankt werden?");
                int menge = Integer.parseInt(scanner.nextLine());
                diese_vehicle.tanken(menge);
            }

        } catch (NumberFormatException e) {
            System.out.println("Fehler: Bitte geben Sie eine gültige Zahl ein!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Fehler: Dieses Fahrzeug existiert nicht!");
        }
    }
}

