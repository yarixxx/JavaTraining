package algo.sort;

public class Bubble extends Swap implements Sort {
    public int[] sort(int[] array) {
        boolean continueCycle = true;
        int cursor = 0;
        boolean swapped = false;
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
