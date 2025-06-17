import java.util.PriorityQueue;
public class RemoveMinQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        minQueue.add(5);
        minQueue.add(2);
        minQueue.add(8);
        minQueue.add(1);
        minQueue.add(9);
        minQueue.add(4);
        System.out.println("Removing elements from min queue:");
        while (!minQueue.isEmpty()) {
            System.out.println(minQueue.poll());
        }
    }
}