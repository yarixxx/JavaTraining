package problems1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTasks2 {

	private Tasks2 tasks2;

	@Before
	public void setUp() throws Exception {
		tasks2 = new Tasks2();
	}

	@Test
	public void testSayHelloBob() {
		assertEquals(tasks2.sayHello("Bob"), "Hello Bob!");
	}
	
	@Test
	public void testSayHelloAlice() {
		assertEquals(tasks2.sayHello("Alice"), "Hello Alice!");
	}
	
	@Test
	public void testSayHelloX() {
		assertEquals(tasks2.sayHello("x"), "Hello x!");
	}
	
	@Test
	public void testExtraEndPrepare() {
		assertEquals(tasks2.extraEnd("prepare"), "rerere");
	}
	
	@Test
	public void testExtraEndWord() {
		assertEquals(tasks2.extraEnd("word"), "rdrdrd");
	}
	
	@Test
	public void testExtraEndAn() {
		assertEquals(tasks2.extraEnd("An"), "AnAnAn");
	}
	
	@Test
	public void testExtraEndN() {
		assertEquals(tasks2.extraEnd("n"), "nnn");
	}
	
	@Test
	public void testFirstTwoN() {
		assertEquals(tasks2.firstTwo("n"), "n");
	}
	
	@Test
	public void testFirstTwoWord() {
		assertEquals(tasks2.firstTwo("word"), "wo");
	}
	
	@Test
	public void testFirstTwoCrust() {
		assertEquals(tasks2.firstTwo("Crust"), "Cr");
	}
	
	@Test
	public void testWrapMondayToTagB() {
		assertEquals(tasks2.wrapToTag("b", "Monday"), "<b>Monday</b>");
	}
	
	@Test
	public void testWrapFridayToTagI() {
		assertEquals(tasks2.wrapToTag("i", "Friday"), "<i>Friday</i>");
	}
	
	@Test
	public void testDoubleHi() {
		assertEquals(tasks2.stringTimes("Hi", 2), "HiHi");
	}
	
	@Test
	public void testTripleHi() {
		assertEquals(tasks2.stringTimes("Hi", 3), "HiHiHi");
	}
	
	@Test
	public void testOnceHi() {
		assertEquals(tasks2.stringTimes("Hi", 1), "Hi");
	}
	
	@Test
	public void testZeroHi() {
		assertEquals(tasks2.stringTimes("Hi", 0), "");
	}
	
	@Test
	public void testFiveHi() {
		assertEquals(tasks2.stringTimes("Hi", 5), "HiHiHiHiHi");
	}

	@Test
	public void testTwoOh() {
		assertEquals(tasks2.stringTimes("Oh!", 2), "Oh!Oh!");
	}
	
	@Test
	public void testXHi() {
		assertEquals(tasks2.stringTimes("x", 4), "xxxx");
	}
	
	@Test
	public void testCode3() {
		assertEquals(tasks2.stringTimes("code", 3), "codecodecode");
	}
	
	@Test
	public void testCode2() {
		assertEquals(tasks2.stringTimes("code", 2), "codecode");
	}

}
