package problems1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Tasks3 {
    public boolean firstLast7(int[] nums) {
        return (nums[0] == 7) || (nums[nums.length - 1] == 7);
    }

    public boolean sameFirstLast(int[] nums) {
        return (nums.length == 0) ? false : (nums[0] == nums[nums.length - 1]);
    }

    public boolean commonStartOrEnd(int[] nums1, int[] nums2) {
        return nums1[0] == nums2[0]
                || nums1[nums1.length - 1] == nums2[nums2.length - 1];
    }

    public int[] middleWay(int[] nums1, int[] nums2) {
        int[] result = new int[2];
        result[0] = nums1[nums1.length / 2];
        result[1] = nums2[nums2.length / 2];
        return result;
    }

    private boolean contains(int[] nums, int q) {
        for (int num : nums) {
            if (num == q) {
                return true;
            }
        }
        return false;
    }

    public boolean has3or5(int[] nums) {
        return contains(nums, 3) || contains(nums, 5);
    }

    public boolean has7and3(int[] nums) {
        return contains(nums, 3) && contains(nums, 7);
    }

    public int sum(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        return result;
    }

    public int max(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (result < num) {
                result = num;
            }
        }
        return result;
    }

    private Entry<Integer, Integer> maxValue(Map<Integer, Integer> frequency) {
        Entry<Integer, Integer> bestEntry = null;
        for (Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (bestEntry == null || bestEntry.getValue() < entry.getValue()) {
                bestEntry = entry;
            }
        }
        return bestEntry;
    }

    private Map<Integer, Integer> countFrequency(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        for (int num : nums) {
            Integer val = frequency.get(num);
            if (val == null) {
                frequency.put(num, 1);
            } else {
                frequency.put(num, val + 1);
            }
        }
        return frequency;
    }

    public int mostFrequent(int[] nums) {
        return maxValue(countFrequency(nums)).getKey();
    }
}
