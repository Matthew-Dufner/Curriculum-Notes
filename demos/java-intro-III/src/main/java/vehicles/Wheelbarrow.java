package vehicles;

import java.util.ArrayList;
import java.util.List;

public class Wheelbarrow implements Hauler{

    public final List<String> cargo = new ArrayList<>();
    @Override
    public void addCargo(String s) {
        cargo.add(s);
    }

    @Override
    public boolean removeCargo(String s) {
        return cargo.remove(s);
    }
}
