package internationalization;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestPriceCalculator {

    private PriceCalculator priceCalculator;
    private float actualCalculatedPrice;

    @Before
    public void setUp() {
        priceCalculator = new PriceCalculator();
    }

    @Test
    public void testThreeOranges() {
        givenOranges(3);
        givenOneOrangePrice(5);
        whenCalculatePriceCalled();
        thenPriceIsFifteen();
    }

    @Test
    public void testFiveOranges() {
        givenOranges(5);
        givenOneOrangePrice(4);
        whenCalculatePriceCalled();
        thenPriceIsTwenty();
    }

    private void givenOneOrangePrice(float price) {
        priceCalculator.setOneOrangePrice(price);
    }

    private void givenOranges(int num) {
        priceCalculator.setOrangesNumber(num);
    }

    private void whenCalculatePriceCalled() {
        actualCalculatedPrice = priceCalculator.calculatePrice();
    }

    private void thenPriceIsFifteen() {
        assertEquals(15, actualCalculatedPrice, 0.1);
    }

    private void thenPriceIsTwenty() {
        assertEquals(20, actualCalculatedPrice, 0.1);
    }
}
