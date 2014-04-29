package algo.sort;

import java.util.Arrays;

public class Quick extends Swap implements Sort {
    @Override
    public int[] sort(int[] array) {
        sortSubArray(array, 0, array.length-1);
        return array;
    }

    private void sortSubArray(int[] array, final int left, final int right) {
        int leftIndex = left;
        int rightIndex = right;
        int distance = right - left;
        if (distance < 2) {
            tryToSwap(array, leftIndex, rightIndex);
            return;
        }
        int pivotIndex = distance / 2;
        boolean doContinue = true;
        while (doContinue) {
            tryToSwap(array, leftIndex, rightIndex);
            leftIndex++;
            rightIndex--;
            doContinue = leftIndex < pivotIndex && rightIndex > pivotIndex;
        }
        sortSubArray(array, leftIndex, pivotIndex);
        sortSubArray(array, pivotIndex, rightIndex);
    }

}
