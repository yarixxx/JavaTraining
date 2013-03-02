package problems1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        Set<Month> months = new HashSet<Month>();
        months.add(Month.DECEMBER);
        months.add(Month.JANUARY);
        months.add(Month.FEBRUARY);
        months.add(Month.MARCH);
        months.add(Month.APRIL);
        months.add(Month.MAY);
        months.add(Month.JUNE);
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
        Set<Month> months = new HashSet<Month>();
        months.add(Month.DECEMBER);
        months.add(Month.JANUARY);
        months.add(Month.FEBRUARY);
        months.add(Month.MARCH);
        months.add(Month.APRIL);
        months.add(Month.MAY);
        months.add(Month.JUNE);
        months.add(Month.JULY);
        months.add(Month.AUGUST);
        Set<Season> expectedSeasons = new HashSet<Season>();
        expectedSeasons.add(Season.WINTER);
        expectedSeasons.add(Season.SPRING);
        expectedSeasons.add(Season.SUMMER);
        assertEquals(expectedSeasons, tasks4.seasonsOver(months));
    }
}
