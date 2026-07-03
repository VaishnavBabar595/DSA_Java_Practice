import java.util.Arrays;
import java.util.Scanner;

public class MinimumPossibleMaxDff {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int t = 1 ;
 
        while (t-- > 0) {
            
            System.out.println("\nEnter no. of Elements (even): ");
            int n = sc.nextInt();
            
            int[] a = new int[n] ;
            
            System.out.println("\nEnter Array Elements : ");
            for( int i = 0 ; i < n ; i++ ){
                
                a[i] = sc.nextInt() ;
            }
            
            Arrays.sort( a ) ;
            int max = 0 ;
            for( int i = 0 ; i < n ; i += 2 ){
                
                max = Math.max( max , a[i+1] - a[i] ) ;
            }
            
            System.out.println( "\nThe minimum possible max diff btwn pairs is : " + max ) ;
        }
    }
}
