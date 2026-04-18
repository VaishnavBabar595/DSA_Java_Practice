import java.util.Arrays;
import java.util.Scanner;

public class KsumPairs {
    
    public static int maxOperations(int[] nums, int k) {
        
        Arrays.sort( nums );
        int count = 0 ; 
        int l = 0 , r = nums.length - 1 ;

        while( l < r ){

            int sum = nums[l] + nums[r] ;

            if( sum < k ) l++ ;
            else if( sum > k ) r-- ;
            else{

                count++ ;
                l++ ;
                r-- ;
            }
        }

        return count ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("\nEnter K : ");
        int k = sc.nextInt();

        int ans = maxOperations( nums1  , k);
        System.out.println("\nMaximum number of pairs having sum K is : " + ans );
    }
}
