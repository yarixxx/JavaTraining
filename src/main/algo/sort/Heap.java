package algo.sort;

public class Heap extends ArrayOperations {
    private int[] array = new int[1000];
    private int heapSize = 0;

    public int getValue(int index) {
        return array[index];
    }

    public int leftChild(int index) {
        return 2 * index + 1;
    }

    public int rightChild(int index) {
        return 2 * index + 2;
    }

    public int parent(int index) {
        if (index > 1) {
            return array[(index - 1) / 2];
        } else {
            return 0;
        }
    }

    public void insert(int value) {
        heapSize++;
        array[heapSize - 1] = value;
        moveUp(heapSize - 1);
    }

    public void remove(int index) {
        heapSize--;
        moveDown(index);
    }

    public void moveDown(int index) {
        int currentIndex = 0;
        int leftIndex = leftChild(index);
        int rightIndex = rightChild(index);
        if (rightIndex >= heapSize || leftIndex >= heapSize) {
            return;
        }

        currentIndex = array[leftIndex] <= array[rightIndex] ? leftIndex
                : rightIndex;

        if (array[index] > array[currentIndex]) {
            array = swap(array, currentIndex, index);
            moveDown(currentIndex);
        }
    }

    private void moveUp(int index) {
        int parent;
        if (index != 0) {
            parent = parent(index);
            if (array[parent] > array[index]) {
                array = swap(array, parent, index);
                moveUp(parent);
            }
        }
    }
}
