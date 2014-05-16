package algo.sort;

import java.util.Arrays;

public class ClassicMerge extends ArrayOperations implements Sort {

    @Override
    public int[] sort(int[] array) {
        if (array.length == 1) {
            return array;
        }
        if (array.length == 2) {
            if (array[0] < array[1]) {
                return array;
            }
            return swap(array, 0, 1);
        }

        int[] left = sort(Arrays.copyOfRange(array, 0, array.length / 2));
        int[] right = sort(Arrays.copyOfRange(array, array.length / 2,
                array.length));

        int cursorLeft = 0, cursorRight = 0;

        int cursor = 0;
        for (; cursor < array.length; cursor++) {
            if (left[cursorLeft] < right[cursorRight]) {
                array[cursor] = left[cursorLeft];
                cursorLeft++;
                if (cursorLeft >= left.length) {
                    System.arraycopy(right, cursorRight, array, cursor + 1,
                            right.length - cursorRight);
                    return array;
                }
            } else {
                array[cursor] = right[cursorRight];
                cursorRight++;
                if (cursorRight >= right.length) {
                    System.arraycopy(left, cursorLeft, array, cursor + 1,
                            left.length - cursorLeft);
                    return array;
                }
            }
        }
        return array;
    }

}
