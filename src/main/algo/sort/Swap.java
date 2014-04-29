package algo.sort;

public class Swap {
    private int operations = 0;
    public final int getOperations() {
        return operations;
    }

    protected boolean tryToSwap(int[] array, int i, int j, boolean swapped) {
        operations++;
        if (array[i] > array[j]) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            return true;
        }
        return swapped;
    }

    protected void oneOperation() {
        operations++;
    }

    protected void tryToSwap(int[] array, int i, int j) {
        operations++;
        if (array[i] > array[j]) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }
}
