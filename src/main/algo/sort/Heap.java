package algo.sort;

public class Heap extends ArrayOperations implements Sort {
    @Override
    public int[] sort(int[] array) {
        return convertToBinary(array);
    }

    private int[] convertToBinary(int[] array) {
        int[] binaryArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            binaryArray[binaryArray.length-1] = array[i];
            boolean swapped = false;
            int cursor = array.length-1;
            while(swapped) {
                swapped = tryToSwap(binaryArray, cursor/2, cursor, swapped);
            }
        }
        return binaryArray;
    }
}
