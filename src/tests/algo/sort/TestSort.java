package algo.sort;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class TestSort {

    private int[] UNSORTED_ARRAY = {4,2,9,1,6,3,5,7};
    private int[] UNSORTED_ARRAY2 = {4,2,9,1,6,3,5,7,8};
    private int[] REVERSED_ARRAY = {9,7,6,5,4,3,2,1};
    private int[] SORTED_ARRAY = {1,2,3,4,5,6,7,9};
    private int[] SORTED_ARRAY2 = {1,2,3,4,5,6,7,8,9};
    private Sort selection = new Selection();
    private Sort insertion = new Insertion();
    private Sort bubble = new Bubble();
    private Sort merge = new Merge();
    private Sort quick = new Quick();
    private Sort heap = new Heap();

    @Test
    @Ignore
    public void testHeap() {
        assertArrayEquals(SORTED_ARRAY, heap.sort(UNSORTED_ARRAY));
        System.out.println(SORTED_ARRAY.length * SORTED_ARRAY.length + " " +heap.getOperations());
        assertTrue(SORTED_ARRAY.length * SORTED_ARRAY.length >= heap.getOperations());
    }

    @Test
    public void testSelection() {
        assertArrayEquals(SORTED_ARRAY, selection.sort(UNSORTED_ARRAY));
        System.out.println(SORTED_ARRAY.length * SORTED_ARRAY.length + " " +selection.getOperations());
        assertTrue(SORTED_ARRAY.length * SORTED_ARRAY.length >= selection.getOperations());
    }

    @Test
    public void testInsertion() {
        assertArrayEquals(SORTED_ARRAY, insertion.sort(UNSORTED_ARRAY));
        System.out.println(SORTED_ARRAY.length * SORTED_ARRAY.length + " " +insertion.getOperations());
        assertTrue(SORTED_ARRAY.length * SORTED_ARRAY.length >= insertion.getOperations());
    }

    @Test
    public void testInsertion2() {
        assertArrayEquals(SORTED_ARRAY2, insertion.sort(UNSORTED_ARRAY2));
        System.out.println(SORTED_ARRAY2.length * SORTED_ARRAY2.length + " " +insertion.getOperations());
        assertTrue(SORTED_ARRAY2.length * SORTED_ARRAY2.length >= insertion.getOperations());
    }

    @Test
    public void testBubbleUnsortedArray() {
        assertArrayEquals(SORTED_ARRAY, bubble.sort(UNSORTED_ARRAY));
        System.out.println(SORTED_ARRAY.length * SORTED_ARRAY.length + " " +bubble.getOperations());
        assertTrue(SORTED_ARRAY.length * SORTED_ARRAY.length >= bubble.getOperations());
    }

    @Test
    public void testBubbleReversed() {
        assertArrayEquals(SORTED_ARRAY, bubble.sort(REVERSED_ARRAY));
        System.out.println(SORTED_ARRAY.length * SORTED_ARRAY.length + " " +bubble.getOperations());
        assertTrue(SORTED_ARRAY.length * SORTED_ARRAY.length >= bubble.getOperations());
    }

    @Test
    @Ignore
    public void testMerge() {
        assertArrayEquals(SORTED_ARRAY, merge.sort(UNSORTED_ARRAY));
        System.out.println(SORTED_ARRAY.length * SORTED_ARRAY.length + " " +merge.getOperations());
        assertTrue(SORTED_ARRAY.length * SORTED_ARRAY.length >= merge.getOperations());
    }

    @Test
    @Ignore
    public void testMerge2() {
        assertArrayEquals(SORTED_ARRAY2, merge.sort(UNSORTED_ARRAY2));
        System.out.println(SORTED_ARRAY2.length * SORTED_ARRAY2.length + " " +merge.getOperations());
        assertTrue(SORTED_ARRAY2.length * SORTED_ARRAY2.length >= merge.getOperations());
    }

    @Test
    public void testQuick() {
        assertArrayEquals(SORTED_ARRAY, quick.sort(UNSORTED_ARRAY));
        System.out.println(SORTED_ARRAY.length * SORTED_ARRAY.length + " " +quick.getOperations());
        assertTrue(SORTED_ARRAY.length * SORTED_ARRAY.length >= quick.getOperations());
    }

    @Test
    public void testQuick2() {
        assertArrayEquals(SORTED_ARRAY2, quick.sort(UNSORTED_ARRAY2));
        System.out.println(SORTED_ARRAY2.length * SORTED_ARRAY2.length + " " +quick.getOperations());
        assertTrue(SORTED_ARRAY2.length * SORTED_ARRAY2.length >= quick.getOperations());
    }
}
