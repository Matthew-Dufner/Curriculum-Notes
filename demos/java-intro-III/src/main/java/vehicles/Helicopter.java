package vehicles;

import java.util.ArrayList;
import java.util.List;

public class Helicopter implements Aircraft, Hauler{
    boolean ready = false;
    String pilot = "";
    int distanceTraveled = 0;
    public final List<String> cargo = new ArrayList<>();

    @Override
    public void preFlightCheck() {
        ready = true;
    }

    @Override
    public String getPilot() {
        return this.pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    @Override
    public void fly() {
        distanceTraveled += 500;
    }

    @Override
    public void addCargo(String s) {
        cargo.add(s);
    }

    @Override
    public boolean removeCargo(String s) {
        return cargo.remove(s);
    }
    @Override
    public void stall() {
        System.out.println("STALL STALL! FLARE THE THING AND TRY NOT TO DIE.");
    }
}
