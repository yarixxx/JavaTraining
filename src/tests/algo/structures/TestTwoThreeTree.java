package algo.structures;

import org.junit.Test;

public class TestTwoThreeTree {

    private static final String ONE = "One";
    private static final String SIX = "Six";
    private static final String TWO = "Two";
    private static final String SEVEN = "Seven";
    private static final String THREE = "Three";
    private static final String FIVE = "Five";

    private final TwoThreeTree ttt = new TwoThreeTree();

    @Test
    public void testPutElementsToTwoThreeTree() {
        ttt.put(5, FIVE);
        ttt.put(3, THREE);
        ttt.put(7, SEVEN);
        ttt.put(2, TWO);
        ttt.put(6, SIX);
        ttt.put(1, ONE);
    }
}
