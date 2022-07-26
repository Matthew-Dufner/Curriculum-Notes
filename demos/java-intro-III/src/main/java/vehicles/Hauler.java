package vehicles;

import java.util.ArrayList;
import java.util.List;

public interface Hauler {
    //All fields in interfaces are implicitly public, static and final
    //public final List<String> cargo = new ArrayList<>();

    public void addCargo(String s);
    public boolean removeCargo(String s);

    default void test() {
        System.out.println("Automobile test method..");
    }
}
