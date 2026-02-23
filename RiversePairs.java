
import java.util.Scanner;

public class RiversePairs {
    
    public static int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;

        if (low >= high) return count;

        int mid = low + (high - low) / 2;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);

        count += countPairs(arr, low, mid, high);

        merge(arr, low, mid, high);

        return count;
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int index = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } 
            else {
                temp[index++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        while (right <= high) {
            temp[index++] = arr[right++];
        }

        // copy to original
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;

        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) arr[i] > 2L * arr[right]) {
                right++;
            }
            count += right - (mid + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.err.println("\nEnter no. of elements in array :");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.err.println("\nEnter array elements :");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = reversePairs(nums);
        System.err.println("The number of reverse pairs is : " + ans );
    }
}
