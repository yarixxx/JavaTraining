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
}
