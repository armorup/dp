package dp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    public void testFibEdgeCases() {
        assertEquals(0, Fibonacci.fib(-1)); // Edge case for negative input
        assertEquals(0, Fibonacci.fib(Integer.MIN_VALUE)); // Edge case for minimum integer value
    }

    @Test
    public void testFibLargeNumbers() {
        assertEquals(6765, Fibonacci.fib(20));
        assertEquals(10946, Fibonacci.fib(21));
        assertEquals(17711, Fibonacci.fib(22));
    }

    @Test
    public void testFibAdditionalCases() {
        assertEquals(89, Fibonacci.fib(11));
        assertEquals(144, Fibonacci.fib(12));
        assertEquals(233, Fibonacci.fib(13));
        assertEquals(377, Fibonacci.fib(14));
        assertEquals(610, Fibonacci.fib(15));
    }
}
