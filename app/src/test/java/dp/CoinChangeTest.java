package dp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CoinChangeTest {
    @Test
    public void testCoinChange() {
        assertEquals(3, CoinChange.coinChange(new int[] { 1, 2, 5 }, 11));
        assertEquals(0, CoinChange.coinChange(new int[] { 1, 2, 5 }, 0));
        assertEquals(-1, CoinChange.coinChange(new int[] { 2 }, 3));
        assertEquals(1, CoinChange.coinChange(new int[] { 1 }, 1));
        assertEquals(2, CoinChange.coinChange(new int[] { 1, 2, 5 }, 6));
    }

    @Test
    public void testCoinChangeEdgeCases() {
        assertEquals(-1, CoinChange.coinChange(new int[] { 2, 5 }, 3));
        assertEquals(20, CoinChange.coinChange(new int[] { 1 }, 20));
        assertEquals(2, CoinChange.coinChange(new int[] { 1, 3, 4 }, 6));
        assertEquals(2, CoinChange.coinChange(new int[] { 1, 3, 4 }, 8));
        assertEquals(2, CoinChange.coinChange(new int[] { 1, 3, 4 }, 7));
    }
}
