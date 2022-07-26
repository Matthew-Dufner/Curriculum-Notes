package vehicles;

public interface Aircraft {
    void preFlightCheck();
    String getPilot();
    void fly();

    default void stall() {
        System.out.println("STALL STALL! OH NO PULL UP! OR ELSE YOU CRASH!");
    }
}
