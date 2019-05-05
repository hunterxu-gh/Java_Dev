import java.util.LinkedList;
import java.util.Queue;

/**
 * TestQueue
 */
public class TestQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Shanghai");
        queue.offer("Beijing");
        queue.offer("Shenzhen");
        queue.offer("Guangzhou");

        while(queue.size() > 0)
            System.out.println(queue.remove() + " ");
    }
}