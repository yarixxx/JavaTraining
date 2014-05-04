package algo.structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestBinarySearchTree {

    private static final String ONE = "One";
    private static final String SIX = "Six";
    private static final String TWO = "Two";
    private static final String SEVEN = "Seven";
    private static final String THREE = "Three";
    private static final String FIVE = "Five";
    private final BinarySearchTree bst = new BinarySearchTree();

    @Test
    public void testPutElementsToBinarySearchTree() {
        bst.put(5, FIVE);
        bst.put(3, THREE);
        bst.put(7, SEVEN);
        bst.put(2, TWO);
        bst.put(6, SIX);
        bst.put(1, ONE);
        assertEquals(FIVE, bst.get(5));
        assertEquals(THREE, bst.get(3));
        assertEquals(SEVEN, bst.get(7));
        assertEquals(TWO, bst.get(2));
        assertEquals(SIX, bst.get(6));
        assertEquals(ONE, bst.get(1));
    }

    @Test
    public void testPutAndDeleteFromBinarySearchTree() {
        bst.put(5, FIVE);
        bst.put(3, THREE);
        bst.put(7, SEVEN);
        bst.put(2, TWO);
        bst.put(6, SIX);
        bst.put(1, ONE);
        assertEquals(FIVE, bst.get(5));
        assertEquals(THREE, bst.get(3));
        assertEquals(SEVEN, bst.get(7));
        assertEquals(TWO, bst.get(2));
        assertEquals(SIX, bst.get(6));
        assertEquals(ONE, bst.get(1));
        bst.delete(3);
        assertNull(bst.get(3));
    }
}
