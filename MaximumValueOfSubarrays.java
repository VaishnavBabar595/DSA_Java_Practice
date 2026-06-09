import java.util.Scanner;

public class MaximumValueOfSubarrays {
    
    public static long maxTotalValue(int[] nums, int k) {
        
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;

        for( int i = 0 ; i < nums.length ; i++ ){

            max = Math.max( max , nums[i] );
            min = Math.min( min , nums[i] );
        }

        long ans = (long) ( max - min ) * k ;
        return ans ;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("\nEnter the number of elements : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            
            nums[i] = sc.nextInt();
        }

        System.out.println("\nEnter the number of subarray allowed : ");
        int k = sc.nextInt();

        long ans = maxTotalValue( nums , k ) ;
        System.out.println("\nThe maximum value of subarrays is " + ans );
    }
}
