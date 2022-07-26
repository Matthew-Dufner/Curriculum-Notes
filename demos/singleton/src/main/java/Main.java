import com.revature.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        s1.setMessage("Set s1 message...");
        Singleton s2 = Singleton.getSingleton();
        s2.setMessage("set s2 message...");
        System.out.println(s1.getMessage());
        System.out.println(s2.getMessage());
    }
}
