package vehicles;

public interface Automobile {

    void start();
    String getDriver();
    void drive();

    default void test() {
        System.out.println("Automobile test method..");
    }
}
