import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KLargestNumbersTest {

    KLargestNumbers appManager = new KLargestNumbers();

    @Test
    public void testFindKLargest_Set1() {
        int[] nums = {3, 1, 5, 12, 2, 11};
        int k = 3;
        List<Integer> result = new ArrayList<>();
        result.add(12);
        result.add(11);
        result.add(5);

        System.out.println("Expected: " + result);
        assertEquals(result, appManager.findKLargest(nums, k));
    }

    @Test
    public void testFindKLargest_Set2() {
        int[] nums = {5, 12, 11, -1, 12};
        int k = 3;
        List<Integer> result = new ArrayList<>();
        result.add(12);
        result.add(12);
        result.add(11);

        System.out.println("Expected: " + result);
        assertEquals(result, appManager.findKLargest2(nums, k));
    }

    @Test
    public void testFindKLargest_Size() {
        int[] nums = {5, 12, 11, -1, 12};
        int k = 3;
        List<Integer> result = new ArrayList<>();
        result.add(12);
        result.add(12);
        result.add(11);

        assertEquals(3, appManager.findKLargest(nums, k).size());
    }
}