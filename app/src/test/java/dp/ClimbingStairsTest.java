package dp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {

    @Test
    public void testClimbStairs() {
        assertEquals(1, ClimbingStairs.climbStairs(1));
        assertEquals(2, ClimbingStairs.climbStairs(2));
        assertEquals(3, ClimbingStairs.climbStairs(3));
        assertEquals(5, ClimbingStairs.climbStairs(4));
        assertEquals(8, ClimbingStairs.climbStairs(5));
    }

    @Test
    public void testClimbStairsEdgeCases() {
        assertEquals(0, ClimbingStairs.climbStairs(0));
        assertEquals(1, ClimbingStairs.climbStairs(1));
        assertEquals(2, ClimbingStairs.climbStairs(2));
        assertEquals(13, ClimbingStairs.climbStairs(6));
        assertEquals(21, ClimbingStairs.climbStairs(7));
    }
}