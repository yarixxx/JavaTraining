package problems1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestTasks3 {

    private Tasks3 tasks3;

    @Before
    public void setUp() throws Exception {
        tasks3 = new Tasks3();
    }

    @Test
    public void testNoSeven() {
        int[] numbers = { 3, 5, 6, 2, 9 };
        assertFalse(tasks3.firstLast7(numbers));
    }

    @Test
    public void testLastSeven() {
        int[] numbers = { 3, 5, 6, 2, 7 };
        assertTrue(tasks3.firstLast7(numbers));
    }

    @Test
    public void testFirstSeven() {
        int[] numbers = { 7, 5, 6, 2 };
        assertTrue(tasks3.firstLast7(numbers));
    }

    @Test
    public void testFirstAndLastAreEquals() {
        int[] numbers = { 7, 5, 6, 7 };
        assertTrue(tasks3.sameFirstLast(numbers));
    }

    @Test
    public void testFirstAndLastAreEquals2() {
        int[] numbers = { 2, 5, 6, 2 };
        assertTrue(tasks3.sameFirstLast(numbers));
    }

    @Test
    public void testFirstAndLastAreNotEquals() {
        int[] numbers = { 2, 5, 3 };
        assertFalse(tasks3.sameFirstLast(numbers));
    }

    @Test
    public void testSameFirstLastArrayIsOneElementOnly() {
        int[] numbers = { 2 };
        assertTrue(tasks3.sameFirstLast(numbers));
    }

    @Test
    public void testSameFirstLastArrayEmpty() {
        int[] numbers = {};
        assertFalse(tasks3.sameFirstLast(numbers));
    }

    @Test
    public void testCommonEnd() {
        int[] numbers1 = { 3, 22, 5 };
        int[] numbers2 = { 6, 41, 5 };
        assertTrue(tasks3.commonStartOrEnd(numbers1, numbers2));
    }

    @Test
    public void testCommonEnd2() {
        int[] numbers1 = { 3, 22, 9 };
        int[] numbers2 = { 6, 41, 33, 9 };
        assertTrue(tasks3.commonStartOrEnd(numbers1, numbers2));
    }

    @Test
    public void testCommonStart() {
        int[] numbers1 = { 13, 22, 2 };
        int[] numbers2 = { 13, 41, 12, 4 };
        assertTrue(tasks3.commonStartOrEnd(numbers1, numbers2));
    }

    @Test
    public void testNotCommonEndOrStart() {
        int[] numbers1 = { 3, 4, 5 };
        int[] numbers2 = { 6, 4, 1 };
        assertFalse(tasks3.commonStartOrEnd(numbers1, numbers2));
    }

}
