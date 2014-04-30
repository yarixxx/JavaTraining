package algo.sort;

public class ClassicSelection extends ArrayOperations implements Sort {

    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i; j < array.length; j++) {
                oneOperation();
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            array = swap(array, i, index);
        }
        return array;
    }

}
