package twopointer;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int mergeIndex = m + n - 1;
        int index1 = m - 1, index2 = n - 1;
        while(index1 > 0 || index2 > 0){
            if (index1 < 0 || nums1[index1] < nums2[index2]){
                nums1[mergeIndex--] = nums2[index2--];
            } else {
                nums1[mergeIndex--] = nums1[index1--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0,0};
        int[] nums2 = {2,5,6,7};
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1,3, nums2,4);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
