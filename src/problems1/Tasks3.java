package problems1;

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
}
