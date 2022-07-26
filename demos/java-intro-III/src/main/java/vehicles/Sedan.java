package vehicles;

public class Sedan implements Automobile {
    boolean running = false;
    int distanceTraveled = 0;

    String driver = "";

    public void start() {
        running = true;
    }

    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void drive() {
        if(!running) {
            System.out.println("Sedan not running!");
            return;
        } else {
            distanceTraveled++;
        }

    }
}
