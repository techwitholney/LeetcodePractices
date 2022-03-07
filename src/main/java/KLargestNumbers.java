import java.util.*;

public class KLargestNumbers {

    // Optimal approach using min heap - O(n)
    public List<Integer> findKLargest(int[] nums, int k) {
        Queue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList result = new ArrayList<>(minHeap);

        for (int num : nums) {
            minHeap.offer(num);
        }

        while (result.size() != k) {
            result.add(minHeap.poll());
        }

        System.out.println("Actual: " + result);
        return result;
    }

    // Brute for approach using sorting - O(nlogn)
    public List<Integer> findKLargest2(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);

        int i = nums.length - 1;
        while (result.size() != k) {
            result.add(nums[i]);
            i--;
        }

        System.out.println("Actual: " + result);
        return result;
    }

    public static int findKSmallest(int[] nums, int k) {
        int result = 0;
        Queue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
        }

        int count = 1;
        while (count != k) {
            minHeap.poll();
            count++;
        }

        result = minHeap.peek();
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 12, 2, 11, 5};
        int k = 5;

        findKSmallest(nums, k);
    }
}
