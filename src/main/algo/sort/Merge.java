package algo.sort;

import java.util.Arrays;

public class Merge extends ArrayOperations implements Sort {
    public int[] sort(final int[] array) {
        oneOperation();
        if (array.length == 1) {
            return array;
        }
        if (array.length == 2) {
            tryToSwap(array, 0, 1);
            return array;
        }
        int[] left = sort(Arrays.copyOfRange(array, 0, (int)Math.floor(array.length/(float)2)));
        int[] right = sort(Arrays.copyOfRange(array, (int)Math.floor(array.length/(float)2), array.length));
        return mergeArrays(left, right);
    }

    private int[] mergeArrays(int[] left, int[] right) {
        int totalLength = left.length+right.length;
        int[] newArray = new int[totalLength];
        int cursor1 = 0, cursor2 = 0;
        for (int i = 0; i < totalLength; i++) {
            int leftElement = left.length > cursor1 ? left[cursor1] : Integer.MAX_VALUE;
            int rightElement = right.length > cursor2 ? right[cursor2] : Integer.MAX_VALUE;
            if (leftElement < rightElement) {
                newArray[i] = leftElement;
                cursor1++;
            } else {
                newArray[i] = rightElement;
                cursor2++;
            }

            oneOperation();
        }
        return newArray;
    }

}
