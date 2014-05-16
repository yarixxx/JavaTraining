package problems1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestTasks2 {

    private Tasks2 tasks2;

    @Before
    public void setUp() throws Exception {
        tasks2 = new Tasks2();
    }

    @Test
    public void testSayHelloBob() {
        assertEquals("Hello Bob!", tasks2.sayHello("Bob"));
    }

    @Test
    public void testSayHelloAlice() {
        assertEquals("Hello Alice!", tasks2.sayHello("Alice"));
    }

    @Test
    public void testSayHelloX() {
        assertEquals("Hello x!", tasks2.sayHello("x"));
    }

    @Test
    public void testExtraEndPrepare() {
        assertEquals("rerere", tasks2.extraEnd("prepare"));
    }

    @Test
    public void testExtraEndWord() {
        assertEquals("rdrdrd", tasks2.extraEnd("word"));
    }

    @Test
    public void testExtraEndAn() {
        assertEquals("AnAnAn", tasks2.extraEnd("An"));
    }

    @Test
    public void testExtraEndN() {
        assertEquals("nnn", tasks2.extraEnd("n"));
    }

    @Test
    public void testFirstTwoN() {
        assertEquals("n", tasks2.firstTwo("n"));
    }

    @Test
    public void testFirstTwoWord() {
        assertEquals("wo", tasks2.firstTwo("word"));
    }

    @Test
    public void testFirstTwoCrust() {
        assertEquals("Cr", tasks2.firstTwo("Crust"));
    }

    @Test
    public void testWrapMondayToTagB() {
        assertEquals("<b>Monday</b>", tasks2.wrapToTag("b", "Monday"));
    }

    @Test
    public void testWrapFridayToTagI() {
        assertEquals("<i>Friday</i>", tasks2.wrapToTag("i", "Friday"));
    }

    @Test
    public void testDoubleHi() {
        assertEquals("HiHi", tasks2.stringTimes("Hi", 2));
    }

    @Test
    public void testTripleHi() {
        assertEquals("HiHiHi", tasks2.stringTimes("Hi", 3));
    }

    @Test
    public void testOnceHi() {
        assertEquals("Hi", tasks2.stringTimes("Hi", 1));
    }

    @Test
    public void testZeroHi() {
        assertEquals("", tasks2.stringTimes("Hi", 0));
    }

    @Test
    public void testFiveHi() {
        assertEquals("HiHiHiHiHi", tasks2.stringTimes("Hi", 5));
    }

    @Test
    public void testTwoOh() {
        assertEquals("Oh!Oh!", tasks2.stringTimes("Oh!", 2));
    }

    @Test
    public void testXHi() {
        assertEquals("xxxx", tasks2.stringTimes("x", 4));
    }

    @Test
    public void testCode3() {
        assertEquals("codecodecode", tasks2.stringTimes("code", 3));
    }

    @Test
    public void testCode2() {
        assertEquals("codecode", tasks2.stringTimes("code", 2));
    }

    @Test
    public void testSplitTextByWords() {
        final String[] expectedArray = { "What", "is", "your", "name?" };
        assertArrayEquals(expectedArray,
                tasks2.splitByWords("What is your name?"));
    }

    @Test
    public void testSplitTextByWords2() {
        final String[] expectedArray = { "What", "day", "is", "it", "today?" };
        assertArrayEquals(expectedArray,
                tasks2.splitByWords("What day is it today?"));
    }

    @Test
    public void testRemoveWhiteSpacesBeforeAndAfter() {
        assertEquals("ford", tasks2.removeSpaces("  ford   "));
    }

    @Test
    public void testRemoveWhiteSpacesBefore() {
        assertEquals("sword", tasks2.removeSpaces("   sword"));
    }

    @Test
    public void testRemoveWhiteSpacesAfter() {
        assertEquals("lord", tasks2.removeSpaces("lord     "));
    }

    @Test
    public void testCouldNotFindSecretWord() {
        assertFalse(tasks2.isThereASecret("it is just simple text"));
    }

    @Test
    public void testFindSecretWordThere() {
        assertTrue(tasks2.isThereASecret("there is no secret"));
    }

    @Test
    public void testFindSecretWordHere() {
        assertTrue(tasks2.isThereASecret("secret is not here"));
    }

    @Test
    public void testComputeInitialForIvanovIvan() {
        assertEquals("I.I.", tasks2.computeInitials("Ivanov Ivan"));
    }

    @Test
    public void testComputeInitialForJoeBlack() {
        assertEquals("J.B.", tasks2.computeInitials("Joe Black"));
    }

    @Test
    public void testComputeInitialForAlbertIntegerStringovich() {
        assertEquals("A.I.S.",
                tasks2.computeInitials("Albert Integer Stringovich"));
    }

    @Test
    public void testComputeInitialForFredFlit() {
        assertEquals("F.F.", tasks2.computeInitials("Fred Flint"));
    }
}
