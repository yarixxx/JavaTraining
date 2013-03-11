package collections;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestPocket {
    private static final int THIRTY = 30;
    private static final int FIFTY = 50;
    private static final int FORTY = 40;
    private static final int ONE_HUNDRED = 100;
    private static final int FIVE = 5;
    private Pocket pocket;
    private boolean result;

    @Before
    public void setUp() throws Exception {
        pocket = new Pocket();
    }

    @Test
    public void testShouldBeAbleToBuyFiftyWithHundred() {
        givenOneHundred();
        whenBuyItemPerFifty();
        thenItemWasBought();
        thenMoneyCollected();
    }

    @Test
    public void testShouldBeAbleToBuyThirtyTwiceWithHundred() {
        givenOneHundred();
        whenBuyItemsTwicePerThirty();
        thenItemWasBought();
        thenMoneyCollected();
    }

    private void thenMoneyCollected() {
        assertTrue(pocket.canIHaveThis(FIVE));
    }

    private void thenItemWasBought() {
        assertTrue(result);
    }

    private void whenBuyItemPerFifty() {
        result = pocket.buyThis(FIFTY);
    }

    private void whenBuyItemsTwicePerThirty() {
        result = pocket.buyThis(THIRTY);
        result = pocket.buyThis(THIRTY);
    }

    private void givenOneHundred() {
        pocket.setMoney(ONE_HUNDRED);
    }
}
