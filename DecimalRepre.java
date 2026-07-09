import java.util.* ;

public class DecimalRepre {
    
    public static int[] decimalRepresentation(int n) {
        
        int a = 0 ;
        int k = n ;
        while( k > 0 ){

            int x = k % 10 ;
            if( x != 0 ) a++ ;
            k = k /10 ;
        }
        int[] ans = new int[a] ;
        int pow = 1 ;
        int i = a-1 ;
        while( n > 0 ){

            int x = n % 10 ;
            if( x != 0 ) ans[i--] = pow * x ;
            pow *= 10 ;
            n = n / 10 ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in ) ;
        System.out.println("\nEnter the number : ");
        int n = sc.nextInt() ;

        int[] ans = decimalRepresentation( n ) ;
        System.out.println("\nThe decimal representation of given number is : ");
        for (int i = 0; i < ans.length ; i++) {
            
            System.out.print( ans[i] + " ");
        }
    }
}
