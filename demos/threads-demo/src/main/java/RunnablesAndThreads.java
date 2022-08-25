import com.revature.MyThread;
import com.revature.RunMe;

public class RunnablesAndThreads {
    public static void main(String[] args) {
        System.out.println("Testing with runnable objects!");
        Thread thread1 = new Thread(new RunMe());
        Thread thread2 = new Thread(new RunMe());
        Thread thread3 = new Thread(new RunMe());
        RunMe runMe = new RunMe();

        thread1.start();
        thread2.start();
        thread3.start();
        runMe.run();


        System.out.println("Testing with Thread class objects!");
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        myThread1.start();
        myThread2.start();
        myThread3.start();




    }
}
