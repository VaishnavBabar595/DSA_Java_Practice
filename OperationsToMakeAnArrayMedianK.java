import java.util.*;

public class OperationsToMakeAnArrayMedianK {
    
    public static long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int mid = n / 2;

        long steps = 0;

        if (nums[mid] < k) {
        
            for (int i = mid; i < n; i++) {
                if (nums[i] < k) {
                    steps += (k - nums[i]);
                } 
                else {
                    break;
                }
            }
        } 
        else {
        
            for (int i = mid; i >= 0; i--) {
                if (nums[i] > k) {
                    steps += (nums[i] - k);
                } 
                else {
                    break;
                }
            }
        }

        return steps;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("\nEnter K : ");
        int k = sc.nextInt();

        long ans = minOperationsToMakeMedianK( nums , k );
        System.out.println("\nThe operations to make median k id : " + ans );

    }
}
