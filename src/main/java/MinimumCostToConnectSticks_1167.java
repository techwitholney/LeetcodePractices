import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumCostToConnectSticks_1167 {

    public static void main(String[] args) {

    }

    protected int connectSticks(int[] sticks) {
        Queue<Integer> queue = new PriorityQueue<>();
        int count = 0;

        for (int stick : sticks) {
            queue.offer(stick);
        }

        while (queue.size() > 1) {
            int sum = queue.poll() + queue.poll();
            count += sum;
            queue.offer(sum);
        }

        return count;
    }
}
