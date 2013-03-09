package problems1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestOrderIt {

    private OrderIt orderIt;

    private final static Integer[] initialNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 0 };
    private final static Integer[] numbersZeroStart = { 0, 1, 2, 3, 4, 5, 6, 7,
            8 };
    private final static Integer[] numbersZeroSecond = { 1, 0, 2, 3, 4, 5, 6,
            7, 8 };

    private Integer[] resultingNumbers;

    private final static int FIRST = 0;
    private final static int SECOND = 1;
    private final static int THIRD = 2;
    private final static int FOURTH = 3;
    private final static int FIFTH = 4;
    private final static int SIXTH = 5;
    private final static int SEVENTH = 6;
    private final static int EIGHTS = 7;
    private final static int NINTH = 8;

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
    public void testSwitchZeroWithNumber() {
        givenZeroStartNumbers();
        whenSwitchElements(FIRST, SECOND);
        thenCheckValuesByPositions(FIRST, SECOND, 1, 0, true);
    }

    @Test
    public void testUnableToSwitchTwoSeparatedCases() {
        givenNumbers();
        whenSwitchElements(FIRST, THIRD);
        thenCheckValuesByPositions(FIRST, THIRD, 1, 3, false);
    }

    @Test
    public void testUnableToSwitchZeroAndNumberWhenTwoSeparatedCases() {
        givenZeroStartNumbers();
        whenSwitchElements(FIRST, THIRD);
        thenCheckValuesByPositions(FIRST, THIRD, 1, 2, false);
    }

    @Test
    public void testUnableToSwitchTwoVerticalNumbersIfNoZero() {
        givenNumbers();
        whenSwitchElements(FIRST, FOURTH);
        thenCheckValuesByPositions(FIRST, FOURTH, 1, 4, false);
    }

    @Test
    public void testShouldBePossibleToSwitchTwoVerticalNumbersIfThereIsZero() {
        givenZeroSecondNumbers();
        whenSwitchElements(FIRST, FOURTH);
        thenCheckValuesByPositions(FIRST, FOURTH, 1, 3, false);
    }

    @Test
    public void testUnableToSwitchThirdAndFourthNumbersWithoutZero() {
        givenNumbers();
        whenSwitchElements(THIRD, FOURTH);
        thenCheckValuesByPositions(THIRD, FOURTH, 3, 4, false);
    }

    @Test
    public void testUnableToSwitchSixthAndSeventhNumbersWithoutZero() {
        givenNumbers();
        whenSwitchElements(SIXTH, SEVENTH);
        thenCheckValuesByPositions(SIXTH, SEVENTH, 6, 7, false);
    }

    private void givenNumbers() {
        orderIt.setNumbers(initialNumbers);
    }

    private void givenZeroStartNumbers() {
        orderIt.setNumbers(numbersZeroStart);
    }

    private void givenZeroSecondNumbers() {
        orderIt.setNumbers(numbersZeroSecond);
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
