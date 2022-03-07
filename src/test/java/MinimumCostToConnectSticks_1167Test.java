import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinimumCostToConnectSticks_1167Test {

    MinimumCostToConnectSticks_1167 appManager = new MinimumCostToConnectSticks_1167();

    @Test
    public void TestConnectSticks_Equals14() {
        int[] sticks = {2, 4, 3};
        System.out.println("Expecting " + 14);
        System.out.println("Actual " + appManager.connectSticks(sticks));
        assertEquals(14, appManager.connectSticks(sticks));
    }

    @Test
    public void TestConnectSticks_Equals30() {
        int[] sticks = {1,8,3,5};
        System.out.println("Expecting " + 30);
        System.out.println("Actual " + appManager.connectSticks(sticks));
        assertEquals(30, appManager.connectSticks(sticks));
    }

    @Test
    public void TestConnectSticks_Equals33() {
        int[] sticks = {1, 3, 11, 5};
        System.out.println("Expecting " + 33);
        System.out.println("Actual " + appManager.connectSticks(sticks));
        assertEquals(33, appManager.connectSticks(sticks));
    }

}