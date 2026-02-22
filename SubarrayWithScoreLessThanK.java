import java.util.Scanner;

public class SubarrayWithScoreLessThanK {

    // SCORE means sum of elements of subarray multiplied by its length 
    
    public static long countSubarrays(int[] nums, long k) {
        

        long count = 0 ;
        int l = 0 , r = 0 ;
        long sum = 0 ;
        while( r < nums.length ){

            sum = sum + (long)nums[r];

            while( sum * (r-l+1)  >= k ){
                sum = sum - nums[l];
                l++ ;
            }
            count = count +  r - l + 1 ;

            r++ ;
        }
        return count ;
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

        System.out.println("\nEnter the expected SCORE : ");
        long k = sc.nextLong();

        long ans = countSubarrays( nums, k) ;
        System.out.println("\nThe number of sub-arrays having SCORE less than given score is : "+ ans);
    }
}
