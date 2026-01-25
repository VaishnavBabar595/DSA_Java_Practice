import java.util.Scanner;

public class rotateArray {

    // Rotate the sorted array by k index 
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;

        reverse(0, len-1, nums);
        reverse(0, k-1, nums);
        reverse(k , len-1, nums);
    }

    // reverse the array from START to END
    public static void reverse(int start, int end, int[] nums) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("No of elements : ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter sorted array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter no of rotations : ");
        int k = sc.nextInt();

        rotate(nums, k);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
