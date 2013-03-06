package problems1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tasks5 {

    public boolean isSquareFree(int num) {
        for (int i = 2; i <= 9; i++) {
            if (num % i == 0 && num / i == i) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> extractSquareFreeNumbers(Integer[] nums) {
        List<Integer> numList = new ArrayList<Integer>();
        for (Integer num : nums) {
            if (isSquareFree(num)) {
                numList.add(num);
            }
        }
        return numList;
    }

    public Integer[] sortEvenOdd(Integer[] nums) {
        EvenOddSort customSort = new EvenOddSort();
        Arrays.sort(nums, customSort);
        return nums;
    }

    static class EvenOddSort implements Comparator<Integer> {
        @Override
        public int compare(Integer x, Integer y) {
            if (x % 2 == 0) {
                return 1;
            }
            if (y % 2 == 0) {
                return -1;
            }
            return 0;
        }
    }

}
