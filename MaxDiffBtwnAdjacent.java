import java.util.Scanner;

public class MaxDiffBtwnAdjacent {
    
    public static int maxAdjacentDistance(int[] nums) {
        
        if( nums.length == 2 ) return Math.abs( nums[0] - nums[1] ) ;

        int max = 0 ;
        int n = nums.length ; 
        for( int i = 0 ; i < n ; i++ ){

            if( max < Math.abs( nums[i] - nums[ (i+1) % n ])) {

                max = Math.abs( nums[i] - nums[ (i+1) % n ]) ;
            }
        }

        return max ; 
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

        int ans = maxAdjacentDistance( nums1 );
        System.out.println("\nThe maximum difference between adjacent elements : " + ans );
    }
}
