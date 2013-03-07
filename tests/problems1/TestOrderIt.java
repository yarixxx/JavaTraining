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

    @Test
    public void testSwitchTwoVerticalNumbers() {
        givenNumbers();
        whenSwitchFirstAndFourth();
        thenTwoVerticalNumbersChangeTheirPlaces();
    }

    @Test
    public void testSwitchTwoVerticalNumbers2() {
        givenNumbers();
        whenSwitchSecondAndFifth();
        thenTwoVerticalNumbersChangeTheirPlaces2();
    }

    @Test
    public void testSwitchThirdAndFourthNumbers() {
        givenNumbers();
        whenSwitchThirdAndFourth();
        thenThirdAndFourthNumbersShouldNotChangeTheirPlaces();
    }

    @Test
    public void testSwitchSixthAndSeventhNumbers() {
        givenNumbers();
        whenSwitchSixthAndSeventh();
        thenSixthAndSeventhNumbersShouldNotChangeTheirPlaces();
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

    public void whenSwitchFirstAndFourth() {
        orderIt.switchNumbers(0, 3);
    }

    public void whenSwitchSecondAndFifth() {
        orderIt.switchNumbers(1, 4);
    }

    public void whenSwitchThirdAndFourth() {
        orderIt.switchNumbers(2, 3);
    }

    public void whenSwitchSixthAndSeventh() {
        orderIt.switchNumbers(5, 6);
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

    public void thenTwoVerticalNumbersChangeTheirPlaces() {
        Integer a = 1;
        Integer b = 4;
        assertEquals(b, orderIt.getValue(0));
        assertEquals(a, orderIt.getValue(3));
    }

    public void thenTwoVerticalNumbersChangeTheirPlaces2() {
        Integer a = 2;
        Integer b = 5;
        assertEquals(b, orderIt.getValue(1));
        assertEquals(a, orderIt.getValue(4));
    }

    public void thenTwoSeparatedNumbersDoNotChangeTheirPlaces() {
        Integer a = 1;
        Integer b = 3;
        assertEquals(a, orderIt.getValue(0));
        assertEquals(b, orderIt.getValue(2));
    }

    public void thenThirdAndFourthNumbersShouldNotChangeTheirPlaces() {
        Integer a = 4;
        Integer b = 5;
        assertEquals(a, orderIt.getValue(3));
        assertEquals(b, orderIt.getValue(4));
    }

    public void thenSixthAndSeventhNumbersShouldNotChangeTheirPlaces() {
        Integer a = 6;
        Integer b = 7;
        assertEquals(a, orderIt.getValue(5));
        assertEquals(b, orderIt.getValue(6));
    }

}
