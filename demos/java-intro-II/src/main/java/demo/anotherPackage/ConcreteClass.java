package demo.anotherPackage;
/*
Whwn we inherit from an abstract class, we must implement the abstract methods in that class. Basically
the abstract class sets forth a promise that children will implement its incomplete methods.
 */
public class ConcreteClass extends AbstractClass{


    //Because we inherit from the abstractClass where there is this abstract method, we must
    //provide an implementation. We must "complete" the method.
    public void abstractMethod(String str) {

    }
}
