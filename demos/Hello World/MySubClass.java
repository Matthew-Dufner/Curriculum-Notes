public class MySubClass extends MyClass{
    private float fl;

    public MySubClass() {
    }

    public MySubClass(String message, int num, Object obj, float fl) {
        super(message, num, obj);
        this.fl = fl;
    }

    public float getFl() {
        return fl;
    }

    public void setFl(float fl) {
        this.fl = fl;
    }

    public void overrideMe() {
        System.out.println("This is the overridden version of the overrideMe method.");
    }

    public void overloadMe() {
        System.out.println("This is no-args overload.");
    }

    public void overloadMe(String str) {
        System.out.println("This is the string overload: " + str);
    }

    public void overloadMe(int i) {
        System.out.println("This is the int overload: " + i);
    }
}
