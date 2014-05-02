package algo.sort;

import org.junit.Test;

public class TestHeap {

    private final Heap heap = new Heap();

    @Test
    public void testMySimpleHeap() {
        heap.insert(9);
        heap.insert(4);
        heap.insert(2);
        heap.insert(5);
        heap.remove(0);
    }

}
