import java.util.*;

public class PartitionArray {
    
    public static int partitionArray(int[] nums, int k) {

        if( nums.length == 1 ) return 1 ;
        
        Arrays.sort( nums );
        int count = 1 ;

        int minpos = 0 ;
        for( int i = 0 ; i < nums.length ; i++ ){

            if( nums[i] - nums[ minpos ] > k){

                count++ ;
                minpos = i ;
            }
        }
        
        return count ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        System.out.println("\nEnter the no of elements : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("\nEnter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("\nEnter maximum difference allowed : ");
        int k = sc.nextInt();

        int result = partitionArray( nums , k );
        System.out.println("\nThe number of parts in which the array is divided is : " + result );
    }
}
