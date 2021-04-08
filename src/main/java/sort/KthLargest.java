package sort;

import java.util.PriorityQueue;

public class KthLargest {
    /**
     * 堆：时间复杂度 O(NlogK), 空间复杂度 O(K)
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : nums){
            pq.add(val);
            if (pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest();
        int largest = kthLargest.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        System.out.println(largest);

        QuickSort quickSort = kthLargest.new QuickSort();
        int largest2 = quickSort.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        System.out.println(largest2);
    }

    /**
     * 快速排序
     */
    class QuickSort{
        public int findKthLargest(int[] nums, int k){
            k = nums.length - k;
            int l = 0, h = nums.length - 1;
            while (l < h){
                int j = partition(nums, l, h);
                if (j == k) {
                    break;
                } else if (j < k) {
                    l = j + 1;
                } else {
                    h = j - 1;
                }
            }
            return nums[k];
        }

        private int partition(int[] a, int l, int h) {
            int i = l, j = h + 1;
            while (true){
                while (a[++i] < a[l] && j < h) ;
                while (a[--j] > a[l] && j > l) ;
                if (i >= j) {
                    break;
                }
                swap(a, i, j);
            }
            swap(a, l, j);

            return j;
        }

        private void swap(int[] a, int i, int j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
}
