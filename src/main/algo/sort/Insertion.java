package algo.sort;

public class Insertion extends ArrayOperations implements Sort {
    @Override
    public int[] sort(int[] array) {
        int[] result = new int[0];
        for (int i = 0; i < array.length; i++) {
            oneOperation();
            result = insert(result, array[i]);
        }
        return result;
    }
}
