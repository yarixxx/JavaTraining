package algo.sort;

import java.util.Arrays;

public class ClassicMerge extends ArrayOperations implements Sort {

    @Override
    public int[] sort(int[] array) {
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, array.length / 2,
                array.length - 1);
        int cursorLeft = 0, cursorRight = 0;

        for (int cursor = 0; cursor < array.length; cursor++) {
            if (left[cursorLeft] < right[cursorRight]) {
                array[cursor] = left[cursorLeft];
                if (cursorLeft >= left.length) {
                    System.arraycopy(right, cursorRight, array, cursor,
                            right.length - cursorRight);
                    return array;
                }
                cursorLeft++;
            } else {
                array[cursor] = right[cursorRight];
                if (cursorRight >= right.length) {
                    System.arraycopy(left, cursorLeft, array, cursor,
                            left.length - cursorLeft);
                    return array;
                }
                cursorRight++;
            }
            cursor++;
        }
        return array;
    }

}
