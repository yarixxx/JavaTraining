package algo.sort;

public class Bubble extends ArrayOperations implements Sort {
    public int[] sort(int[] array) {
        boolean continueCycle = true, swapped = true;
        int cursor = 0;
        while (continueCycle) {
            if (array[cursor] > array[cursor+1]) {
                swap(array, cursor, cursor+1);
                swapped = true;
            }
            cursor++;
            if (cursor+2 > array.length) {
                continueCycle = swapped;
                swapped = false;
                cursor = 0;
            }
        }
        return array;
    }
}
