package algo.sort;

public class Selection extends Swap implements Sort {
    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                tryToSwap(array, j, i);
            }
        }
        return array;
    }
}