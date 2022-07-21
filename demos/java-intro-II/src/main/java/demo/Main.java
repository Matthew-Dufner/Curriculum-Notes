package demo;

import demo.anotherPackage.AbstractClass;
import demo.anotherPackage.ConcreteClass;
import demo.other.FinalClass;
import demo.user.Admin;
import demo.user.User;

public class Main {
    String classScopedString = "This is class scoped, the closest we can get to global scope in Java.";

    public static void main(String[] args) {
        User user = new User();
        MyClass myClass = new MyClass();

        FinalClass finalClass = new FinalClass();
        finalClass.setSomething("This is something");

        //can't do this, we cannot instantiate an object from an abstract class.
        // Abstract classes are only good for inheritance
        //AbstractClass abstractClass = new AbstractClass();

        ConcreteClass concreteClass = new ConcreteClass();
        System.out.println(concreteClass.getStr());


        /*
        equality checking
         */

        int a = 1;
        int b = 1;
        if(a == b) {
            //This is a perfectly good equality check
        }

        User kyle = new User("Kyle", "Plummer", 37);
        User kyle2 = new User("Kyle", "Plummer", 37);
        User vraj = new User("Vraj", "Pandya", 22);

        if(kyle.equals(kyle2)) {
            System.out.println("The kyles are equal");
        }
        if(kyle.equals(vraj)) {
            System.out.println("Kyle equals vraj?");
        }

        Integer integerA = a;
        Integer integerB = b;

        if(integerB.equals(integerA)) {
            System.out.println("Wrapper deep equality check is true!");
        }
        if(integerB == integerA) {
            System.out.println("Wrapper shallow equality check is true!");
        }

        String str1 = "hello";
        String str2 = "hello";
        str2 = "else";

        if(str2 == str1) {
            System.out.println("Shallow equality check on string true?");
        }


        /*
        Strings are immutable - cannot be changed
         */
        String str = "Hello!";
        str = "Goodbye";
        str += " Kyle!";

        //This is how you create a string without putting it in the string pool:
        String nonPool = new String("Hello");

        String inPool = "Hello";

        if(inPool == nonPool) {
            System.out.println("The string pool is weird!");
        }
        if(inPool.equals(nonPool)) {
            System.out.println("This one should be true");
        }
        nonPool = nonPool.intern();
        if(inPool == nonPool) {
            System.out.println("Now this check will be true");
        }

        System.out.println("This " + "is " + "a " + "String");

        StringBuilder sb = new StringBuilder();
        sb.append("This ");
        sb.append("is ");
        sb.append("a ");
        sb.append("string!");
        System.out.println(sb.toString());

        StringBuffer buf = new StringBuffer();
        buf.append("This");


        /*
        Scopes in Java

         */
        String methodLevelScope = "This string is scoped to the method level, " +
                "it remains in scope during the main method. When the main method is complete, " +
                "this falls out of scope.";

        for(int i = 0; i < 10; i++) {
            String blockScope = "This is block scoped. It becomes invalid when the block is complete. " +
                    "For loops, this block is what is looped, so this string is created, then invalidated " +
                    "each time the loop iterates. This for loop will result in the createion and destruction" +
                    "of 10 of these strings.";
        }


        {
            String blockScope = "This is also block scoped. Note that the previous reference of the same name" +
                    "doesn't cause us problems here. Because that has fallen out of scope.";
            String testString = "This is a string to show how these scopes limit where the references are valid.";
            //it works here...
            System.out.println(testString);
        }

        //But this causes an error because testString ceases to exist, falls out of scope, before we get here.
        //System.out.println(testString);


        //we do not have access to z here. z is not yet in scope, it hasn't been declared yet.
        //System.out.println("Z: " + z);
        char z = 'z';
        //we have access to z here.
        System.out.println("Z: " + z);
        {
            char y = 'y';
            System.out.println("Y: " + y);
            //we have access to z here.
            System.out.println("Z: " + z);
        }
        //we have access to z here.
        System.out.println("Z: " + z);

        //we do not have access to y here:
        //System.out.println("Y: " + y);

        Admin admin = new Admin();
        String str3 = "hello";
        admin.methodScope();//str3 is not accessible within the method scope... unless we
        admin.methodScope(str3);
        System.out.println(str3);


        //pass-by-value
        User newUser = new User("Kyle", "Plummer", 37);
        int i = 55;

        passByValueTest(i, newUser);
        System.out.println("Pass by value test - i: " + i + ". firstname: " + newUser.getFirstName());


    }

    /*
    Java is pass-by-value, even references get copied, just the ref, not the object it points to
     */
    public static void passByValueTest(int i, User u) {
        i++;
        u.setFirstName("elsifughbwelrgijnb");
    }
}
