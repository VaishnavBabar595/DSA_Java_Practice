
import java.util.*;

public class NoOfCalls {
    
    public static void main(String[] args) {

            Scanner sc = new Scanner( System.in ) ;
            System.out.println("\nEnter no friends : ");
            int n = sc.nextInt();
            int[] a = new int[n] ;
            System.out.println("\nEnter positions of friends :");
            for( int i = 0 ; i < n ; i++ ){
                
                a[i] = sc.nextInt() ;
                
                
            }
            
            Arrays.sort( a ) ;
            int mid = n / 2 ;
            int l = 0 ;
            for( int i = 0 ; i < mid ; i++ ){
                
                if( a[i] != a[mid] ) l++ ;
            }
            
            int r = 0 ;
            for( int i = mid+1 ; i < n ; i++ ){
                
                if( a[i] != a[mid] ) r++ ;
            }
            
            
            System.out.println("\nMaximum no. of calls get all friends together is : " + Math.max( l , r ) ) ;
    }
}
