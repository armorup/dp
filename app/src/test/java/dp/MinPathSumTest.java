package dp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinPathSumTest {

        @Test
        public void testMinPathSum() {
                int[][] grid1 = {
                                { 1, 3, 1 },
                                { 1, 5, 1 },
                                { 4, 2, 1 }
                };
                assertEquals(7, new MinPathSum().minPathSum(grid1));

                int[][] grid2 = {
                                { 1, 2, 3 },
                                { 4, 5, 6 }
                };
                assertEquals(12, new MinPathSum().minPathSum(grid2));

                int[][] grid3 = {
                                { 1, 2 },
                                { 1, 1 }
                };
                assertEquals(3, new MinPathSum().minPathSum(grid3));
        }

        @Test
        public void testMinPathSumEdgeCases() {
                int[][] grid4 = {
                                { 1 }
                };
                assertEquals(1, new MinPathSum().minPathSum(grid4));

                int[][] grid5 = {
                                { 1, 2, 3, 4, 5 }
                };
                assertEquals(15, new MinPathSum().minPathSum(grid5));

                int[][] grid6 = {
                                { 1 },
                                { 2 },
                                { 3 },
                                { 4 },
                                { 5 }
                };
                assertEquals(15, new MinPathSum().minPathSum(grid6));
        }
}