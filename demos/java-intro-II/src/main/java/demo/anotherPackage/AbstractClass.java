package demo.anotherPackage;
/*
Abstract classes cannot be instantiated on their own. Abstract classes are only for being inherited.
 */
public abstract class AbstractClass {
    private String str = "This is an abstract class";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    /*
    Abstract methods, likewise, cannot be invoked and actually don't have an implementation (AKA a body)
    We just provide the method signature: access modifiers, non-access modifiers,
    return type, identifier, parameter list. Then we end the statement without opening a { block of code }
     */
    public abstract void abstractMethod(String str);
}
