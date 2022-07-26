import stuff.CoolMath;
import stuff.User;
import vehicles.Helicopter;
import vehicles.PickupTruck;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String ...args) {
        int[] numArray = new int[]{0,1,2,3,4};
        int a = 7;

        //our reference: where the beginning of the array can be found (the 0th element)
        //width of each element: ints are 32 bit which means the element width is 32
        //index - any element the array can be retrieved by its index.

        //to find an element in the array by index we use the array identifier and the [index]
        int x = numArray[2];
        Object[] o = new Object[3];//array of length 3
        String[] name = new String[]{"Kyle", "Steven", "Raquel", "Vraj"}; //array of length 4
        String anotherName = "name";

        String[][] multidimensionalArray = new String[][]{{"Kyle", "Rebecca", "Steven"}, {"Vraj", "Brian", "Luke"}};


        User matthew = new User("Matthew", "Dufner", 29);
        User[] associates = new User[]{matthew, new User("Rebecca", "Candelaria", 28), new User("Brian", "Kunkel", 44)};

        System.out.println(associates[0]);

        List<User> userList = new LinkedList<>();
        userList.add(matthew);
        userList.add(associates[1]);
        userList.add(associates[2]);

        System.out.println(userList);


        System.out.println(CoolMath.sum(1,2));
        System.out.println(CoolMath.sum());
        System.out.println(CoolMath.sum(1,2,3,4,5,6,7,8,9,0));
        System.out.println(CoolMath.sum(numArray));


        /*
        Interfaces:
         */
        PickupTruck truck = new PickupTruck();
        truck.setDriver("Kyle");
        truck.start();
        truck.addCargo("Groceries");
        truck.drive();

        Helicopter helicopter = new Helicopter();
        helicopter.setPilot("Hasan");
        helicopter.preFlightCheck();
        helicopter.addCargo("Heart transplant");
        helicopter.fly();

        System.out.println("Does truck contain heart transplant? " + truck.removeCargo("Heart transplant"));

        helicopter.stall();

    }
}



