import java.util.Scanner;

public class MinSizeSubarraySum {

// return the minimum length of subarray that has sum equal to or greater than target 

    public static int minSubArrayLen(int target, int[] nums) {
        boolean found = false ;
        int minlen = Integer.MAX_VALUE;
        int l = 0 ;
        int sum = 0 ;
        for(int r = 0 ; r < nums.length ; r++){
            sum += nums[r];

            while( sum >= target ){

                if( sum >= target){
                    if( minlen > r - l + 1) minlen = r - l + 1 ;
                    found = true ;
                }
                sum -= nums[l];
                l++ ;
            }
            
        }
        if(found){
            return minlen ;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements in array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target sum : ");
        int k = sc.nextInt();

        int ans = minSubArrayLen( k , nums);
        System.out.println("\nThe minimum length of subarrays which have sum equal to or greater than " + k + " is " + ans);
    }

}
