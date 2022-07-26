package vehicles;

import java.util.ArrayList;
import java.util.List;

public class PickupTruck implements Automobile, Hauler{
    boolean running = false;
    int distanceTraveled = 0;
    String driver = "";
    public final List<String> cargo = new ArrayList<>();
    @Override
    public void start() {
        this.running = true;
    }

    @Override
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        if(!running) {
            System.out.println("Pickup not running!");
            return;
        } else {
            distanceTraveled++;
        }
    }

    @Override
    public void test() {
        //Automobile.super.test();
        Hauler.super.test();
    }


    @Override
    public void addCargo(String s) {
        cargo.add(s);
    }

    @Override
    public boolean removeCargo(String s) {
        return cargo.remove(s);

    }
}
