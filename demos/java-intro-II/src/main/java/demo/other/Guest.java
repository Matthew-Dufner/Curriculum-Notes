package demo.other;

import demo.user.User;
/*
This class extends User, but User has a method marked final, finalMethod(), which cannot be overridden
 */
public class Guest extends User {
    User user = new User();

    //Final variables cannot be re-assigned. We can assign them at declaration or
    // construction time and then never again
    public final int finalInt;
    public final int finalInt2 = 5;

    public Guest() {
        /*
        We can assign a value to the final variable here because this is the constructor.
        We can only assign values to final variables when they are first declared, a constructor is
        invoked at the beginning of the life of this object, at this time it is still appropriate to
        initialize it (assign an initial value).
         */
        finalInt = 5;
    }

    public void testMethod() {
        //finalInt = 5; //This line will cause an error, because finalInt is final
        this.test = 5;//note we have access to this protected field
    }

    //Can't override this method, because it's been declared final in the parent class
    /*
    public static final void finalMethod() {


    }
    */
}
