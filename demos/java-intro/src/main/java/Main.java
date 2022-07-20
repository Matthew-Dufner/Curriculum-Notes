import java.util.LinkedList;
import java.util.List;

/*
In this demo we will go over classes, objects, primitives, wrappers, and flow control.
 */
public class Main {
    public static void main(String[] args) {
        /*
        Classes vs objects. Classes are blueprints or templates to build objects out of.
        We define the class with data and behaviors in it's own file, and we instantiate
        objects of that class.
         */

        /*
        We use the User class constructor (invoked with the "new" keyword) to create an object in heap memory.
        The result of invoking the constructor is that an amount of memory is reserved in the heap, and the location
        of that memory is returned to us. That memory address is then assigned with the "=" operator to the reference
        called "referenceName"
         */
        User referenceName = new User();

        /*
        Now that we have our object on the heap, and a reference to it, we can use the "." operator to "de-reference",
        which just means follow that reference to where it points. If we follow our reference, iot leads to our object,
        and we can invoke its data and behaviors.
         */
        referenceName.setFirstName("reference");
        referenceName.setLastName("name");
        referenceName.setAge(0);

        /*
        Let's create a number of other users, by invoking one of the constructors we wrote. This time we are invoking
        the all-args constructor, the one we wrote which takes two strings and an int in its parameter list.
         */

        User kyle = new User("Kyle", "Plummer", 37);
        User luke = new User("Luke", "Harris", 23);
        User tommy = new User("Tommy", "Cavanagh", 23);
        User steven = new User("Steven", "Knox", 43);

        /*
        If I take the object which represents Luke, and change the values, it is still the same object.
        It might perfectly match the object that the kyle reference points to, but these are separate objects
        in memory and changes to one do not affect the other.
         */
        luke.setFirstName("Kyle");
        luke.setLastName("Plummer");
        luke.setAge(37);
        luke.setLastName("something else entirely");

        /*
        Garbage collection is the process by which the JVM frees up heap memory that is no longer in use.
        Garbage collection is done by thr JVM periodically, and you can't really control it. You can, at best,
        suggest to the JVM that it run garbage collection soon.
        Once the last reference to an object on the heap is invalidated, the object can no longer be accessed by our
        application. These are called "orphaned" objects, and it is these orphaned objects that the JVM
        garbage collects.
        let's remove the last valid reference to the kyle object so that it gets garbage collected.
         */
        kyle = null;

        System.gc(); //at best, this is a suggestion to the JVM to preform garbage collection.
        /*
        The garbage collector is going to run at some point after this moment. No idea when, we can't directly control it.
         */


        /*
        Data types in Java
        byte - 8 bits, use for anything that needs to be 8 bits. Usually small numbers or characters.
        char - single character. representation based on encoding. In Java this is UTF-8 by default.
        short - integer type, but smaller than an int (fewer bits, thus can hold fewer possible values)
        int - 32-bit signed integer. Can hold negative and positive whole numbers. -2147483648 to 2147483647
        long - 64-bit signed integer. Can hold enormous negative and positive values. -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807
        float - floating point type, holds fractional (decimal) values.
            Floats use a different form of math to preform arithmetic operations. See more info on floats below.
        double - a bigger (more precise) floating point type.
        boolean - holds a true or false value.
         */
        byte by = 100;
        char ch = 'S';
        short sh = 100;
        int in = 240000000;
        long lo = 500000000;
        float fl = 6.2f;
        double db = 6.2;
        boolean bool = true;

        /*
        Notes on Floats: Floats use a totally different type of arithmetic called floating point operations, or FLOPS.
        Floats store numeric values in three parts: Base, Precision, and an exponent. It's similar to scientific notation.
        Floats and doubles, because of the way they work, have a property called precision. This basically means that
        floats and doubles can store many many more representations than you might expect, but some of these get less
        precise when the decimal values get very very tiny. This can result in things like 0.1 + 0.2 == 0.3 being false,
        due to precision the result of the addition might end up 0.299999999999999999999999991 or something.
         */



        Byte byWrapper;
        Character charWrapper;
        Short shortWrapper;
        Integer intWrapper;
        Long longWrapper;
        Float floatWrapper;
        Double doubleWrapper;
        Boolean boolWrapper;

        String str;

        /*
        Boxing, unboxing, and autoboxing

         */
        Integer integer = 5;
        int x = integer;





        /*
        Flow control
        loops: for, while, do-while, for-each (enhanced for loop)
        branching: if-then, if-then-else, switch
        Jump: method invocation and return
         */

        System.out.println("Count to ten: ");
        for(int i = 1; i <= 10; i++) {
            //here we put instructions that will occur potentially many times as the loop iterates.
            System.out.println(i);
        }
        System.out.println("Count down from ten: ");
        for(int j = 10; j > 0; j--) {
            System.out.println(j);
        }
        System.out.println("Count binary powers: ");
        for (int k = 1; k < 4096; k = k * 2) {
            System.out.println(k);
        }

        System.out.println("Count to ten in the while loop way: ");
        int l = 1;
        while(l <= 10) {
            System.out.println(l);
            l++;
        }

        System.out.println("While Loop until iterator hits 5: ");
        boolean quit = false;
        int m = 0;
        while(!quit) {
            System.out.println(m);
            if(m == 5) {
                quit = true;
            }
            m++;
        }

        //quit is still true from earlier
        do {
            System.out.println("do while loops always execute at least once before checking the loop condition");
        } while (!quit);

        //We will cover enhanced for loop in greater detail after talking about Java Collection API
        List<User> userList = new LinkedList<>();
        userList.add(luke);
        userList.add(tommy);
        userList.add(steven);

        /*
        Enhanced for loop, AKA for-each loop will iterate through a "Collection" acting on one element at time
        from that collection. A reference to the element in question is stored in the temporary reference "u"
        We will cover this in greater detail after we talk about what Collections are.
         */
        for(User u : userList) {
            System.out.println(u.getFirstName());
        }


        /*
        Branching - sometimes we will want different instructions to be completed depending on the situation.
         */



        /*
        If statement - if the predicate resolves to true, do the statements in the code block
         */
        if(luke.getFirstName().equals("Kyle")) {
            luke.setFirstName("Luke");
            luke.setLastName("Harris");
            luke.setAge(23);
        }
        System.out.println("Luke's name has been corrected: " + luke.getFirstName());

        if(luke.getLastName().equals("Plummer")) {
            System.out.println("The predicate above will be false, so this should not ever happen.");
        } else {
            System.out.println("This is the else block, and executed when that predicate is false");
        }

        if(1 > 5) {
            System.out.println("one is not greater than five");
        } else if(2 > 5) {
            System.out.println("two is also not greater than five");
        } else if (10 > 5) {
            System.out.println("Indeed ten is greater than five");
        } else if(-10 > 5) {
            System.out.println("This one is false too!");
        } else if (100 > 5) {
            System.out.println("This predicate is true, but we never get here. We only hit one of these blocks");
        } else {
            System.out.println("This happens if none of the above predicates were true");
        }

        User u = userList.get(1);
        switch(u.getLastName()) {
            case "Plummer":
                //do something
                break;
            case "Harris":
                //do a different thing
                break;
            case "Knox":
                //do something here
                break;
            default:
                //if none of the other cases were true, preform this action - the default action
                break;
        }

        //Here is an interesting use of switch fall-through
        String input = "Q";
        switch(input) {
            case "1":
                //get menu item 1
                break;
            case "2":
                //get menu item 2
                break;
            case "q":
            case "Q":
                //quit
                break;

        }


        /*
        Method invocation: leave behind a stack frame, jump to elsewhere in the code, execute from there (some methods
        instructions) and finally return to the stack frame, and continue executing with the next instruction from there.
        When we return from methods, we sometimes have a return value, after the execution completes in the method
        and, we return to the calling code the method will have resolved to its return type.
         */

        //here the return type from setAge is void, so no value returned here
        u.setAge(99);


        System.out.println("The program is complete.");

    }
}
