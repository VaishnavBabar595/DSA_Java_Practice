import java.util.*;

public class MaxBeauty {
    
    public static int maximumBeauty(int[] nums, int k) {
        
        Arrays.sort( nums );

        int l = 0 , r = 0 ;
        int maxlen = 1 ;

        while( r < nums.length ){

            int diff = nums[r] - nums[l];

            if( diff > 2*k ){

                l++ ;
            }
            
            diff = nums[r] - nums[l] ;
            if( diff <= 2*k && maxlen < r - l + 1){

                maxlen = r - l + 1 ;
            }

            r++ ;
        }

        return maxlen ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        System.out.println("\nEnter no of array elements : ");
        int n = sc.nextInt() ;

        int[] nums = new int[n];

        System.out.println("\nEnter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("\nEnter maximum change allowed : ");
        int k = sc.nextInt();

        int result = maximumBeauty( nums , k );
        System.out.println("\nThe maximum length of subsequence having beauty is : " + result );
    }
}
