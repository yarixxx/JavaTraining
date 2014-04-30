package algo.sort;

import java.util.Arrays;

public class Quick extends ArrayOperations implements Sort {
    @Override
    public int[] sort(int[] array) {
        array = sortSubArray(array);
        return array;
    }

    private int[] sortSubArray(int[] array) {
        if (array.length < 2) {
            tryToSwap(array, 0, array.length);
            return array;
        }
        int pivotIndex = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, pivotIndex);
        int[] right = Arrays.copyOfRange(array, pivotIndex+1, array.length);
        int[] newLeft = new int[0];
        int[] newRight = new int[0];
        int pivot = array[pivotIndex];
        for (int i = 0; i < left.length; i++) {
            if (left[i] > pivot) {
                newRight = push(newRight, left[i]);
            } else {
                newLeft = push(newLeft, left[i]);
            }
        }
        for (int i = 0; i < right.length; i++) {
            if (right[i] < pivot) {
                newLeft = push(newLeft, right[i]);
            } else {
                newRight = push(newRight, right[i]);
            }
        }
        newLeft = sortSubArray(newLeft);
        newLeft = push(newLeft, pivot);
        return concatArrays(newLeft, sortSubArray(newRight));
    }

}
