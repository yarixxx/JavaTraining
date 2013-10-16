package problems1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestTasks1 {
    private Tasks1 tasks1;

    @Before
    public void setUp() throws Exception {
        tasks1 = new Tasks1();
    }

    @Test
    public void testSleepIn() {
        assertTrue(tasks1.sleepIn(false, false));
        assertFalse(tasks1.sleepIn(true, false));
        assertTrue(tasks1.sleepIn(false, true));
        assertTrue(tasks1.sleepIn(true, true));
    }

    @Test
    public void testMonkeyTrouble() {
        assertTrue(tasks1.monkeyTrouble(true, true));
        assertTrue(tasks1.monkeyTrouble(false, false));
        assertFalse(tasks1.monkeyTrouble(true, false));
        assertFalse(tasks1.monkeyTrouble(false, true));
    }

    @Test
    public void testSumDouble() {
        assertEquals(tasks1.sumDouble(1, 2), 3);
        assertEquals(tasks1.sumDouble(3, 2), 5);
        assertEquals(tasks1.sumDouble(2, 2), 8);
        assertEquals(tasks1.sumDouble(-1, 0), -1);
        assertEquals(tasks1.sumDouble(3, 3), 12);
        assertEquals(tasks1.sumDouble(0, 0), 0);
        assertEquals(tasks1.sumDouble(0, 1), 1);
        assertEquals(tasks1.sumDouble(3, 4), 7);
    }

    @Test
    public void testDiff19() {
        assertEquals(tasks1.diff21(19), 2);
    }

    @Test
    public void testDiff10() {
        assertEquals(tasks1.diff21(10), 11);
    }

    @Test
    public void testDiff0() {
        assertEquals(tasks1.diff21(0), 21);
    }

    @Test
    public void testDiff22() {
        assertEquals(tasks1.diff21(22), 2);
    }

    @Test
    public void testDiff25() {
        assertEquals(tasks1.diff21(25), 8);
    }

    @Test
    public void testDiff30() {
        assertEquals(tasks1.diff21(30), 18);
    }

    @Test
    public void testDiff00() {
        assertEquals(tasks1.diff21(0), 21);
    }

    @Test
    public void testDiff1() {
        assertEquals(tasks1.diff21(1), 20);
    }

    @Test
    public void testDiff2() {
        assertEquals(tasks1.diff21(2), 19);
    }

    @Test
    public void testDiff2_1() {
        assertEquals(tasks1.diff21(-1), 22);
    }

    @Test
    public void testDiff2_2() {
        assertEquals(tasks1.diff21(-2), 23);
    }

    @Test
    public void testDiff2_20() {
        assertEquals(tasks1.diff21(50), 58);
    }

    @Test
    public void testParrotTrouble() {
        assertTrue(tasks1.parrotTrouble(true, 6));
    }

    @Test
    public void testParrotTrouble2() {
        assertFalse(tasks1.parrotTrouble(true, 7));
    }

    @Test
    public void testParrotTrouble3() {
        assertFalse(tasks1.parrotTrouble(false, 6));
    }

    @Test
    public void testParrotTrouble4() {
        assertTrue(tasks1.parrotTrouble(true, 21));
    }

    @Test
    public void testParrotTrouble5() {
        assertFalse(tasks1.parrotTrouble(false, 21));
    }

    @Test
    public void testParrotTrouble6() {
        assertFalse(tasks1.parrotTrouble(false, 20));
    }

    @Test
    public void testParrotTrouble7() {
        assertTrue(tasks1.parrotTrouble(true, 23));
    }

    @Test
    public void testParrotTrouble8() {
        assertFalse(tasks1.parrotTrouble(false, 23));
    }

    @Test
    public void testParrotTrouble9() {
        assertFalse(tasks1.parrotTrouble(true, 20));
    }

    @Test
    public void testParrotTrouble10() {
        assertFalse(tasks1.parrotTrouble(false, 12));
    }

    @Test
    public void testMakes10() {
        assertTrue(tasks1.makes10(9, 10));
    }

    @Test
    public void testMakes10_1() {
        assertFalse(tasks1.makes10(9, 9));
    }

    @Test
    public void testMakes10_2() {
        assertTrue(tasks1.makes10(1, 9));
    }

    @Test
    public void testMakes10_3() {
        assertTrue(tasks1.makes10(10, 1));
    }

    @Test
    public void testMakes10_4() {
        assertTrue(tasks1.makes10(10, 10));
    }

    @Test
    public void testMakes10_5() {
        assertTrue(tasks1.makes10(8, 2));
    }

    @Test
    public void testMakes10_6() {
        assertFalse(tasks1.makes10(8, 3));
    }

    @Test
    public void testMakes10_7() {
        assertTrue(tasks1.makes10(10, 42));
    }

    @Test
    public void testMakes10_8() {
        assertTrue(tasks1.makes10(12, -2));
    }

    @Test
    public void testFiveIsFive() {
        assertTrue(tasks1.isFive(5));
    }

    @Test
    public void testTwoIsNotFive() {
        assertFalse(tasks1.isFive(2));
    }
}
