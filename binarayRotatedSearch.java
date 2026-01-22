/*  This is the program to find the index of number in rotated sorted array by using
the algo of binary search . Time Complexity O(log n).
*/

public class binarayRotatedSearch {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low] < nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target <= nums[high] && target > nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // We have to input a rotated sorted array
        int[] arr = { 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 };
        System.err.println(search(arr,10));
    }
}
