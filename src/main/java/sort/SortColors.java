package sort;

public class SortColors {
    public void sortColors(int[] nums) {
        int zero = -1, one = 0, two = nums.length;
        while (one < two) {
            if (nums[one] == 0) {
                swap(nums, ++zero, one++);
            } else if (nums[one] == 2) {
                swap(nums, --two, one);
            } else {
                ++one;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        int[] nums = {2,0,2,1,1,0};
        sortColors.sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
