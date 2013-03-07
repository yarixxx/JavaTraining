package problems1;

import static org.junit.Assert.assertArrayEquals;

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

        orderIt.getNumbers();
    }

    public void givenNumbers() {
        orderIt.setNumbers(initialNumbers);
    }

    public void whenGetNumbers() {
        resultingNumbers = orderIt.getNumbers();
    }

    public void thenNumbersAreTheSame() {
        assertArrayEquals(initialNumbers, resultingNumbers);
    }
}
