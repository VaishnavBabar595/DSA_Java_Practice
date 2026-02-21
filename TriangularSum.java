import java.util.* ;

public class TriangularSum {
    
    public static int triangularSum(int[] nums) {
        
        if( nums.length == 1){
            return nums[0];
        }

        int[] arr = new int[nums.length - 1];

        for( int i = 0 ; i < nums.length - 1 ; i++){

            arr[i] = ( nums[i] + nums[ i + 1] ) % 10 ;
        }

        return ( triangularSum( arr )) ;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.err.println("\nEnter the no. of array Elements :");
        int n = sc.nextInt();

        int[] nums = new int[n] ;
        System.err.println("\nEnter array Elements :");
        for( int i = 0 ; i < n ; i++){

            nums[i] = sc.nextInt();
        }

        int ans = triangularSum( nums );
        System.err.println("\nThe triangular sum of given array is : " + ans );
    }
}
