import java.util.Arrays;
import java.util.Scanner;

public class MovesToEqualArray {
    
    public static int minMoves2(int[] nums) {
        
        Arrays.sort( nums );
        int n = nums.length ;
        int j = nums[n / 2] ;
        int steps = 0 ;

        for( int i = 0 ; i < n ; i++ ){

            steps += Math.abs( j - nums[i] ) ;
        }

        if( n % 2 == 0 ){
            
            int steps2 = 0 ;
            j = nums[ n/2 - 1 ];
            for( int i = 0 ; i < n ; i++ ){

                steps2 += Math.abs( j - nums[i] ) ;
            }

            if( steps > steps2 ){

                steps = steps2 ;
            }
        }

        return steps ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array-1 : ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter array-1 elements : ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        int ans = minMoves2( nums1 );
        System.out.println("\nNumber of operations to make all array elements equal are : " + ans );
    }
}
