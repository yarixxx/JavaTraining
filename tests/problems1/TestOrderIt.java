package problems1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestOrderIt {

    private OrderIt orderIt;

    private final Integer[] initialNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
    private Integer[] resultingNumbers;

    @Before
    public void setUp() throws Exception {
        orderIt = new OrderIt();
    }

    @Test
    public void testIfSetNumbersShouldGetTheSameNumbers() {
        givenNumbers();
        whenGetNumbers();
        thenNumbersAreTheSame();
    }

    @Test
    public void testSwitchTwoNumbers() {
        givenNumbers();
        whenSwitchFirstAndSecond();
        thenTwoNumbersChangeTheirPlaces();
    }

    @Test
    public void testSwitchTwoSeparatedNumbers() {
        givenNumbers();
        whenSwitchFirstAndThird();
        thenTwoSeparatedNumbersDoNotChangeTheirPlaces();
    }

    public void givenNumbers() {
        orderIt.setNumbers(initialNumbers);
    }

    public void whenGetNumbers() {
        resultingNumbers = orderIt.getNumbers();
    }

    public void whenSwitchFirstAndSecond() {
        orderIt.switchNumbers(0, 1);
    }

    public void whenSwitchFirstAndThird() {
        orderIt.switchNumbers(0, 2);
    }

    public void thenNumbersAreTheSame() {
        assertArrayEquals(initialNumbers, resultingNumbers);
    }

    public void thenTwoNumbersChangeTheirPlaces() {
        Integer a = 1;
        Integer b = 2;
        assertEquals(b, orderIt.getValue(0));
        assertEquals(a, orderIt.getValue(1));
    }

    public void thenTwoSeparatedNumbersDoNotChangeTheirPlaces() {
        Integer a = 1;
        Integer b = 3;
        assertEquals(a, orderIt.getValue(0));
        assertEquals(b, orderIt.getValue(2));
    }
}
