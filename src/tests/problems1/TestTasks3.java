package problems1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
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

    @Test
    public void testMiddleWay7_34() {
        int[] numbers1 = { 2, 7, 1 };
        int[] numbers2 = { 56, 34, 21 };
        int[] expected = { 7, 34 };
        assertArrayEquals(expected, tasks3.middleWay(numbers1, numbers2));
    }

    @Test
    public void testMiddleWay23_4() {
        int[] numbers1 = { 2, 0, 23, 88, 1 };
        int[] numbers2 = { 56, 4, 21 };
        int[] expected = { 23, 4 };
        assertArrayEquals(expected, tasks3.middleWay(numbers1, numbers2));
    }

    @Test
    public void testMiddleWay31_74() {
        int[] numbers1 = { 7, 2, 0, 31, 88, 1, 3 };
        int[] numbers2 = { 56, 3, 74, 1, 21 };
        int[] expected = { 31, 74 };
        assertArrayEquals(expected, tasks3.middleWay(numbers1, numbers2));
    }

    @Test
    public void testHas3or5_3() {
        int[] nums = { 7, 2, 0, 31, 88, 1, 3 };
        assertTrue(tasks3.has3or5(nums));
    }

    @Test
    public void testHas3or5_5() {
        int[] nums = { 17, 5, 20, 1, 8 };
        assertTrue(tasks3.has3or5(nums));
    }

    @Test
    public void testHasNo3or5() {
        int[] nums = { 7, 25, 12, 71 };
        assertFalse(tasks3.has3or5(nums));
    }

    @Test
    public void testHasNo7and3_any() {
        int[] nums = { 2, 25, 12, 71 };
        assertFalse(tasks3.has7and3(nums));
    }

    @Test
    public void testHas7and3_3() {
        int[] nums = { 3, 25, 12, 15 };
        assertFalse(tasks3.has7and3(nums));
    }

    @Test
    public void testHas7and3_7() {
        int[] nums = { 15, 2, 7, 13 };
        assertFalse(tasks3.has7and3(nums));
    }

    @Test
    public void testHas7and3_3_7() {
        int[] nums = { 15, 3, 43, 7, 13 };
        assertTrue(tasks3.has7and3(nums));
    }

    @Test
    public void testHas7and3_7_3() {
        int[] nums = { 15, 7, 43, 37, 3, 232 };
        assertTrue(tasks3.has7and3(nums));
    }

    @Test
    public void testHasNo7and3_7_7() {
        int[] nums = { 15, 7, 43, 37, 7, 232 };
        assertFalse(tasks3.has7and3(nums));
    }

    @Test
    public void testHasNo7and3_3_3() {
        int[] nums = { 3, 47, 73, 37, 3, 27 };
        assertFalse(tasks3.has7and3(nums));
    }

    @Test
    public void testSum10() {
        int[] nums = { 3, 4, 2, 1 };
        assertEquals(10, tasks3.sum(nums));
    }

    @Test
    public void testSum25() {
        int[] nums = { 3, 10, 7, 2, 1, 1, 1 };
        assertEquals(25, tasks3.sum(nums));
    }

    @Test
    public void testMax25() {
        int[] nums = { 3, 10, 25, 2, 13, 22, 24 };
        assertEquals(25, tasks3.max(nums));
    }

    @Test
    public void testMax93() {
        int[] nums = { 53, 0, 5, 92, 93, 43, 22, 24 };
        assertEquals(93, tasks3.max(nums));
    }

    @Test
    public void testMostFrequent9() {
        int[] nums = { 9, 0, 2, 9, 4, 5, 1 };
        assertEquals(9, tasks3.mostFrequent(nums));
    }

    @Test
    public void testMostFrequent19() {
        int[] nums = { 9, 5, 0, 4, 2, 9, 7, 4, 19, 5, 19, 1, 19 };
        assertEquals(19, tasks3.mostFrequent(nums));
    }

    @Test
    public void testScoresIncreasing1() {
        int[] scores = { 1, 2, 3, 4, 10 };
        assertTrue(tasks3.scoresIncreasing(scores));
    }

    @Test
    public void testScoresIncreasing2() {
        int[] scores = { 3, 12, 33, 54, 110 };
        assertTrue(tasks3.scoresIncreasing(scores));
    }

    @Test
    public void testScoresNotIncreasing1() {
        int[] scores = { 3, 132, 33, 54, 110 };
        assertFalse(tasks3.scoresIncreasing(scores));
    }

    @Test
    public void testScoresNotIncreasing2() {
        int[] scores = { 23, 132, 233, 54, 310 };
        assertFalse(tasks3.scoresIncreasing(scores));
    }
}
