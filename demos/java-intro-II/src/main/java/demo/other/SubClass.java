package demo.other;
//we can't extend the final class, because classes marked final cannot be extended.
// Note below I have commented out the part of the class declaration that would extend FinalClass
public class SubClass /* extends FinalClass */{
    private int i;
    private boolean b;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }
}
