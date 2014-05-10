package algo.sort;

public class Selection extends ArrayOperations implements Sort {
    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    swap(array, i, j);
                }
            }
        }
        return array;
    }
}
