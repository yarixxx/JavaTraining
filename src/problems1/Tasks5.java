package problems1;

import java.util.ArrayList;
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

    public List<Integer> extractSquareFreeNumbers(int[] nums) {
        List<Integer> numList = new ArrayList<Integer>();
        for (Integer num : nums) {
            if (isSquareFree(num)) {
                numList.add(num);
            }
        }
        return numList;
    }
}
