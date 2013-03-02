package problems1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
}
