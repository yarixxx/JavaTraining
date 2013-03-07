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
        whenSwitchElements(0, 1);
        thenCheckValuesByPositions(0, 1, 2, 1);
    }

    @Test
    public void testSwitchTwoSeparatedNumbers() {
        givenNumbers();
        whenSwitchElements(0, 2);
        thenCheckValuesByPositions(0, 2, 1, 3);
    }

    @Test
    public void testSwitchTwoVerticalNumbers() {
        givenNumbers();
        whenSwitchElements(0, 3);
        thenCheckValuesByPositions(0, 3, 4, 1);
    }

    @Test
    public void testSwitchTwoVerticalNumbers2() {
        givenNumbers();
        whenSwitchElements(1, 4);
        thenCheckValuesByPositions(1, 4, 5, 2);
    }

    @Test
    public void testSwitchThirdAndFourthNumbers() {
        givenNumbers();
        whenSwitchElements(2, 3);
        thenCheckValuesByPositions(2, 3, 3, 4);
    }

    @Test
    public void testSwitchSixthAndSeventhNumbers() {
        givenNumbers();
        whenSwitchElements(5, 6);
        thenCheckValuesByPositions(5, 6, 6, 7);
    }

    public void givenNumbers() {
        orderIt.setNumbers(initialNumbers);
    }

    public void whenGetNumbers() {
        resultingNumbers = orderIt.getNumbers();
    }

    public void whenSwitchElements(int a, int b) {
        orderIt.switchNumbers(a, b);
    }

    public void thenNumbersAreTheSame() {
        assertArrayEquals(initialNumbers, resultingNumbers);
    }

    public void thenCheckValuesByPositions(int p1, int p2, Integer v1,
            Integer v2) {
        assertEquals(v1, orderIt.getValue(p1));
        assertEquals(v2, orderIt.getValue(p2));
    }

}
