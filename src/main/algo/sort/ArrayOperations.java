package algo.sort;

public class ArrayOperations {
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
        if (array.length > 2 && array[i] > array[j]) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }

    protected int[] insert(int[] array, int element) {
        int[] updatedArray = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            oneOperation();
            if (array[i] >= element) {
                System.arraycopy(array, 0, updatedArray, 0, i);
                System.arraycopy(array, i, updatedArray, i + 1, array.length - i);
                updatedArray[i] = element;
                return updatedArray;
            }
        }
        System.arraycopy(array, 0, updatedArray, 0, array.length);
        updatedArray[array.length] = element;
        return updatedArray;
    }

    protected int[] insert(int[] array, int index, int element) {
        int[] updatedArray = new int[array.length+1];
        System.arraycopy(array, 0, updatedArray, 0, index);
        System.arraycopy(array, index, updatedArray, index + 1, array.length - index);
        updatedArray[index] = element;
        return updatedArray;
    }

    protected int[] push(int[] array, int element) {
        int[] updatedArray = new int[array.length+1];
        System.arraycopy(array, 0, updatedArray, 0, array.length);
        updatedArray[array.length] = element;
        return updatedArray;
    }

    protected int[] concatArrays(int[] array1, int[] array2) {
        int[] updatedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, updatedArray, 0, array1.length);
        System.arraycopy(array2, 0, updatedArray, array1.length, array2.length);
        return updatedArray;
    }
}
