package algo.sort;

public class Bubble extends ArrayOperations implements Sort {
    public int[] sort(int[] array) {
        boolean continueCycle = true, swapped = false;
        int cursor = 0;
        while (continueCycle) {
            swapped = tryToSwap(array, cursor, cursor+1, swapped);
            cursor++;
            if (cursor+2 > array.length) {
                if (!swapped) {
                    continueCycle = false;
                }
                swapped = false;
                cursor = 0;
            }
        }
        return array;
    }
}
