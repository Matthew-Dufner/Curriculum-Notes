import com.revature.SharedResource;
import com.revature.SynchronizedTest;

import java.util.ArrayList;
import java.util.List;

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        SynchronizedTest thread1 = new SynchronizedTest(resource);
        SynchronizedTest thread2 = new SynchronizedTest(resource);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Count: " + resource.getSum());

    }
}
