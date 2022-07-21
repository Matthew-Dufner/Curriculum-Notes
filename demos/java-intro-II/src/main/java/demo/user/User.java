package demo.user;

import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private int age;

    public int test;


    protected int test() {
        return test;
    }

    public User() {
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static final void finalMethod() {
        System.out.println("This method is final and cannot be overridden.");
    }



//    @Override
//    public boolean equals(Object obj) {
//        User u = (User)obj;
//
//        if(u.getFirstName() == this.getFirstName()
//                && u.getLastName() == this.getLastName()
//                && u.getAge() == this.getAge()
//                && u.test() == this.test() ) {
//            return true;
//        }
//        return false;
//
//    }


    /*
    Deep equality checking: == only checks variables as they are stored in the stack. For object references,
    that means it only checks the memory addresses that the references point to. This isn't a good
    way to determine if two different objects are equivalent. Two User objects would be equivalent if
    they contain the exact same state. So, to do a deeper check for equality, we use the .equals() method.
    This is inherited from the Object class, so all classes have a default implementation for .equals().
    But, we need to create our own implementation if we want it to work. The default implementation is
    the same as "==". It just checks the memory addresses.
     */
    @Override
    public boolean equals(Object o) {
        /*
        First we check if the references do actually point at the same object, in which case they are
        definitely equal. Any object equals itself.
         */
        if (this == o) return true;

        /*
        Then we check to see if the other object is null or is the wrong type. If it's null or if it's the
        wrong type, the objects being checked are definitely not equivalent.
         */
        if (o == null || getClass() != o.getClass()) return false;

        //Here we cast the object we are checking into a User object. We already know this is fine, because we checked the type above.
        User user = (User) o;
        return age == user.age && test == user.test && firstName.equals(user.firstName) && lastName.equals(user.lastName);
    }


}


