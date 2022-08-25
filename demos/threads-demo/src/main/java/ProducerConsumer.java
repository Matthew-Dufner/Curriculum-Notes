import com.revature.Consumer;
import com.revature.Producer;

import java.util.ArrayDeque;
import java.util.Deque;

public class ProducerConsumer {
    public static void main(String[] args) {
        Deque<Integer> buffer = new ArrayDeque<>();

        Consumer consumer = new Consumer(buffer);
        Producer producer = new Producer(buffer);

        producer.start();
        consumer.start();


    }
}
