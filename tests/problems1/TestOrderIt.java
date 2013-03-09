package problems1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestOrderIt {

    private OrderIt orderIt;

    private final Integer[] initialNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 0 };
    private Integer[] resultingNumbers;

    private final int FIRST = 0;
    private final int SECOND = 1;
    private final int THIRD = 2;
    private final int FOURTH = 3;
    private final int FIFTH = 4;
    private final int SIXTH = 5;
    private final int SEVENTH = 6;

    private boolean operationResult = false;

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
        whenSwitchElements(FIRST, SECOND);
        thenCheckValuesByPositions(FIRST, SECOND, 2, 1, true);
    }

    @Test
    public void testSwitchTwoSeparatedNumbers() {
        givenNumbers();
        whenSwitchElements(FIRST, THIRD);
        thenCheckValuesByPositions(FIRST, THIRD, 1, 3, false);
    }

    @Test
    public void testSwitchTwoVerticalNumbers() {
        givenNumbers();
        whenSwitchElements(FIRST, FOURTH);
        thenCheckValuesByPositions(FIRST, FOURTH, 4, 1, true);
    }

    @Test
    public void testSwitchTwoVerticalNumbers2() {
        givenNumbers();
        whenSwitchElements(SECOND, FIFTH);
        thenCheckValuesByPositions(SECOND, FIFTH, 5, 2, true);
    }

    @Test
    public void testSwitchThirdAndFourthNumbers() {
        givenNumbers();
        whenSwitchElements(THIRD, FOURTH);
        thenCheckValuesByPositions(THIRD, FOURTH, 3, 4, false);
    }

    @Test
    public void testSwitchSixthAndSeventhNumbers() {
        givenNumbers();
        whenSwitchElements(SIXTH, SEVENTH);
        thenCheckValuesByPositions(SIXTH, SEVENTH, 6, 7, false);
    }

    private void givenNumbers() {
        orderIt.setNumbers(initialNumbers);
    }

    private void whenGetNumbers() {
        resultingNumbers = orderIt.getNumbers();
    }

    private void whenSwitchElements(int a, int b) {
        operationResult = orderIt.switchNumbers(a, b);
    }

    private void thenNumbersAreTheSame() {
        assertArrayEquals(initialNumbers, resultingNumbers);
    }

    private void thenCheckValuesByPositions(int p1, int p2, Integer v1,
            Integer v2, boolean expected) {
        assertEquals(expected, operationResult);
        assertEquals(v1, orderIt.getValue(p1));
        assertEquals(v2, orderIt.getValue(p2));
    }

}
