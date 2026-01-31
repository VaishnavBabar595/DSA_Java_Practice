import java.util.HashMap;
import java.util.Scanner;

public class  FibonacciSubarray{

    // this function returns maximum length of fibonacci subarray sub arrays 
    public static int longestSubarray(int[] nums) {
        int maxLength = 2 ;
        int count = 2 ;
        for(int i = 2 ; i < nums.length ; i++){
            if( nums[i] == nums[i-1] + nums[i-2]){
                count++ ;
            }
            else{
                count = 2 ;
            }
            
            if(maxLength < count )  maxLength = count ;
        }
        return maxLength ;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements in array ( >= 3): ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = longestSubarray(nums);
        System.out.println("\nThe length of longest fibonacci subarray is "+ ans);
    }
}
