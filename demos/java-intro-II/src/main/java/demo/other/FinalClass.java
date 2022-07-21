package demo.other;

/*
Final classes cannot be inherited. It can only be instantiated as an object.
Basically the opposite of an abstract class.
 */
public final class FinalClass {
    private String something = "This is a string";

    public FinalClass() {
    }

    public FinalClass(String something) {
        this.something = something;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }
}
