package problems1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestTasks5 {

    private Tasks5 tasks5;

    @Before
    public void setUp() throws Exception {
        tasks5 = new Tasks5();
    }

    @Test
    public void testIsSquareFree() {
        assertFalse(tasks5.isSquareFree(4));
        assertTrue(tasks5.isSquareFree(6));
        assertTrue(tasks5.isSquareFree(7));
        assertTrue(tasks5.isSquareFree(8));
        assertFalse(tasks5.isSquareFree(9));
        assertTrue(tasks5.isSquareFree(10));
        assertFalse(tasks5.isSquareFree(16));
        assertFalse(tasks5.isSquareFree(25));
        assertTrue(tasks5.isSquareFree(30));
    }

    @Test
    public void testExtractSquareFreeNumbers() {
        Integer[] nums = { 4, 6, 7, 8, 9, 10, 16, 25, 30 };
        Integer[] expected = { 6, 7, 8, 10, 30 };
        assertTrue(Arrays.asList(expected).equals(
                tasks5.extractSquareFreeNumbers(nums)));
    }

    @Ignore
    @Test
    public void testSortEvenOdd1() {
        Integer[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer[] expected = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
        assertArrayEquals(expected, tasks5.sortEvenOdd(nums));
    }

}
