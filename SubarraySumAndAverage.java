import java.util.Scanner;

public class SubarraySumAndAverage {

    // Given an array of integers arr and two integers k and threshold,
    //  return the number of sub-arrays of size k and average greater than or equal to threshold
    public static int numOfSubarrays(int[] nums, int k, int threshold) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int avg = sum / k;
        if (avg >= threshold)
            count++;
        for (int i = k, j = 0; i < nums.length && j < nums.length; i++, j++) {
            sum += nums[i];
            sum -= nums[j];
            avg = sum / k;
            if (avg >= threshold)
                count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array ( >= 3): ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("\nEnter the Subarray length ( <= n) : ");
        int length = sc.nextInt();

        System.out.println("\nEnter the Threshould of average : ");
        int threshold = sc.nextInt();

        int ans = numOfSubarrays( nums, length , threshold) ;
        System.out.println("\nThe number of sub-arrays having average greater than or equal threshould is : "+ ans);
    }
}
