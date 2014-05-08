package algo.sort;

public class Bubble extends ArrayOperations implements Sort {
    public int[] sort(int[] array) {
        boolean swapped = true;
        int cursor = 0;
        while (swapped || array.length-1 > cursor) {
            cursor++;
            if (array[cursor-1] > array[cursor]) {
                swap(array, cursor-1, cursor);
                swapped = true;
            }
            if (swapped && array.length-1 <= cursor) {
                swapped = false;
                cursor = 0;
            }
        }
        return array;
    }
}
