package internationalization;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

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
        givenGermanLocale();
        whenCalculatePriceCalled();
        thenPriceIsFifteen();
        thenFifteenFormatedInEuro();
    }

    @Test
    public void testFiveOranges() {
        givenOranges(5);
        givenOneOrangePrice(4);
        givenFrenchLocale();
        whenCalculatePriceCalled();
        thenPriceIsTwenty();
        thenTwentyFormattedInEuro();
    }

    private void givenGermanLocale() {
        Locale loc = new Locale("de", "DE");
        priceCalculator.setNumberFormatter(loc);
    }

    private void givenFrenchLocale() {
        Locale loc = new Locale("fr", "FR");
        priceCalculator.setNumberFormatter(loc);
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

    private void thenTwentyFormattedInEuro() {
        assertEquals("20,00 €", priceCalculator.formatPrice());
    }

    private void thenFifteenFormatedInEuro() {
        assertEquals("15,00 €", priceCalculator.formatPrice());
    }
}
