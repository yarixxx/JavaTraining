package problems1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import problems1.Tasks4.Month;
import problems1.Tasks4.Season;
import problems1.Tasks4.WeekDay;

public class TestTasks4 {

    private Tasks4 tasks4;

    @Before
    public void setUp() throws Exception {
        tasks4 = new Tasks4();
    }

    @Test
    public void testSundayFree() {
        WeekDay day = WeekDay.SUNDAY;
        assertTrue(tasks4.isFreeDay(day));
    }

    @Test
    public void testMondayBusy() {
        WeekDay day = WeekDay.MONDAY;
        assertFalse(tasks4.isFreeDay(day));
    }

    @Test
    public void testFridayBusy() {
        WeekDay day = WeekDay.FRIDAY;
        assertFalse(tasks4.isFreeDay(day));
    }

    @Test
    public void testTuesdayBusy() {
        WeekDay day = WeekDay.TUESDAY;
        assertFalse(tasks4.isFreeDay(day));
    }

    @Test
    public void testSaturdayFree() {
        WeekDay day = WeekDay.SATURDAY;
        assertTrue(tasks4.isFreeDay(day));
    }

    @Test
    public void testSeptemberBelongsToAutumn() {
        Month m = Month.SEPTEMBER;
        assertEquals(tasks4.getSeason(m), Season.AUTUMN);
    }

    @Test
    public void testFebruaryBelongsToWinter() {
        Month m = Month.FEBRUARY;
        assertEquals(tasks4.getSeason(m), Season.WINTER);
    }

    @Test
    public void testJuneBelongsToSummer() {
        Month m = Month.JUNE;
        assertEquals(tasks4.getSeason(m), Season.SUMMER);
    }

    @Test
    public void testJuneBelongsToSpring() {
        Month m = Month.MARCH;
        assertEquals(tasks4.getSeason(m), Season.SPRING);
    }

    @Test
    public void testSpringIsOver() {
        Month[] monthsArray = { Month.DECEMBER, Month.JANUARY, Month.FEBRUARY,
                Month.MARCH, Month.APRIL, Month.MAY, Month.JUNE };
        Set<Month> months = new HashSet<Month>(Arrays.asList(monthsArray));
        Set<Season> expectedSeasons = new HashSet<Season>();
        expectedSeasons.add(Season.WINTER);
        expectedSeasons.add(Season.SPRING);
        assertEquals(expectedSeasons, tasks4.seasonsOver(months));
    }

    @Test
    public void testWinterIsOver() {
        Set<Month> months = new HashSet<Month>();
        months.add(Month.DECEMBER);
        months.add(Month.JANUARY);
        months.add(Month.FEBRUARY);
        Set<Season> expectedSeasons = new HashSet<Season>();
        expectedSeasons.add(Season.WINTER);
        assertEquals(expectedSeasons, tasks4.seasonsOver(months));
    }

    @Test
    public void testSummerIsOver() {
        Month[] monthsArray = { Month.DECEMBER, Month.JANUARY, Month.FEBRUARY,
                Month.MARCH, Month.APRIL, Month.MAY, Month.JUNE, Month.JULY,
                Month.AUGUST };
        Set<Month> months = new HashSet<Month>(Arrays.asList(monthsArray));
        Set<Season> expectedSeasons = new HashSet<Season>();
        expectedSeasons.add(Season.WINTER);
        expectedSeasons.add(Season.SPRING);
        expectedSeasons.add(Season.SUMMER);
        assertEquals(expectedSeasons, tasks4.seasonsOver(months));
    }

    @Test
    public void testCleanDuplicates() {
        Integer[] numsArrayWithDups = { 1, 2, 4, 6, 7, 9, 4, 1, 5, 2 };
        Integer[] expectedArray = { 1, 2, 4, 6, 7, 9, 5 };
        Arrays.sort(expectedArray);
        Integer[] actualResult = tasks4.removeDuplicates(numsArrayWithDups);
        Arrays.sort(actualResult);
        assertArrayEquals(expectedArray, actualResult);
    }

    @Test
    public void testCleanDuplicates2() {
        Integer[] numsArrayWithDups = { 2, 2, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7 };
        Integer[] expectedArray = { 2, 3, 4, 5, 6, 7 };
        assertArrayEquals(expectedArray,
                tasks4.removeDuplicates(numsArrayWithDups));
    }

    @Test
    public void testCleanDuplicates3() {
        Integer[] numsArrayWithDups = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Integer[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertArrayEquals(expectedArray,
                tasks4.removeDuplicates(numsArrayWithDups));
    }

    @Test
    public void testArmstrongNumber153() {
        assertTrue(tasks4.isArmstrongNumber(153));
    }

    @Test
    public void testArmstrongNumber371() {
        assertTrue(tasks4.isArmstrongNumber(371));
    }

    @Test
    public void testArmstrongNumber370() {
        assertTrue(tasks4.isArmstrongNumber(370));
    }

    @Test
    public void testArmstrongNumber407() {
        assertTrue(tasks4.isArmstrongNumber(407));
    }

    @Test
    public void testArmstrongNumber271() {
        assertFalse(tasks4.isArmstrongNumber(271));
    }

    @Test
    public void testArmstrongNumber631() {
        assertFalse(tasks4.isArmstrongNumber(271));
    }

    @Test
    public void testArmstrongNumber777() {
        assertFalse(tasks4.isArmstrongNumber(777));
    }

    @Test
    public void testIsPowerOfFive77() {
        assertFalse(tasks4.isPowerOfFive(777));
    }

    @Test
    public void testIsPowerOfFive25() {
        assertTrue(tasks4.isPowerOfFive(25));
    }

    @Test
    public void testIsPowerOfFive137() {
        assertFalse(tasks4.isPowerOfFive(137));
    }

    @Test
    public void testIsPowerOfFive35() {
        assertFalse(tasks4.isPowerOfFive(35));
    }

    @Test
    public void testIsPowerOfFive65() {
        assertFalse(tasks4.isPowerOfFive(65));
    }

    @Test
    public void testIsPowerOfFive125() {
        assertTrue(tasks4.isPowerOfFive(125));
    }

    @Test
    public void testFizzBuzz1() {
        int[] nums = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        String[] expected = { "Buzz", "Fizz", "8", "7", "Fizz", "Buzz", "4",
                "Fizz", "2", "1" };
        assertArrayEquals(expected, tasks4.fizzBuzz(nums));
    }

    @Test
    public void testFizzBuzz5() {
        int[] nums = { 10, 5 };
        String[] expected = { "Buzz", "Buzz" };
        assertArrayEquals(expected, tasks4.fizzBuzz(nums));
    }

    @Test
    public void testFizzBuzz2() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String[] expected = { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz" };
        assertArrayEquals(expected, tasks4.fizzBuzz(nums));
    }

    @Test
    public void testFizzBuzz3() {
        int[] nums = { 1, 3, 4, 6, 7, 9, 11 };
        String[] expected = { "1", "Fizz", "4", "Fizz", "7", "Fizz", "11" };
        assertArrayEquals(expected, tasks4.fizzBuzz(nums));
    }

    @Test
    public void testFizzBuzz4() {
        int[] nums = { 1, 4, 7, 11 };
        String[] expected = { "1", "4", "7", "11" };
        assertArrayEquals(expected, tasks4.fizzBuzz(nums));
    }

    @Test
    public void testFizzBuzz6() {
        int[] nums = { 30, 22, 15, 7 };
        String[] expected = { "FizzBuzz", "22", "FizzBuzz", "7" };
        assertArrayEquals(expected, tasks4.fizzBuzz(nums));
    }

}
