
import java.util.Scanner;

public class IsArrayTrionic {
    
    public static boolean isTrionic(int[] nums) {
        
        int p = 0 ;
        int n = nums.length ;
        while( p < n-1 && nums[p] < nums[p+1] ) p++ ;
        if( p == 0 || p == n-1 ) return false ;

        int q = p ;
        while( q < n-1 && nums[q] > nums[q+1] ) q++ ;
        if( q == p || q == n-1 ) return false ;

        int r = q ;
        while( r < n-1 && nums[r] < nums[r+1] ) r++ ;
        if( r != n-1 ) return false ;

        return true ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in ) ;
        System.out.println("\nEnter number of elements : ");
        int n = sc.nextInt() ;

        System.out.println("\nEnter array elements : ");
        int[] arr = new int[n] ;
        for (int i = 0; i < n; i++) {
            
            arr[i] = sc.nextInt() ;
        }

        if( isTrionic(arr)) System.out.println("\n! YES ! The given array is Trionic .");
        else System.out.println("\nNo the given array is not trionic .");
    }
}
