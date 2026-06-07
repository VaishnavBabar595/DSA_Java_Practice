import java.util.Scanner;

public class SetBitsConsecutive {
    
    public static boolean consecutiveSetBits(int n) {
        
        int pair = 0 ;
        int count = 0 ;

        while( n != 0 ){

            if( ( n & 1 ) != 0 ) count++ ;
            else count = 0 ;

            if( count > 2 ) return false ;
            if( count == 2 ) pair++ ;
            if( pair > 1 ) return false ;

            n = ( n >> 1 ) ;
        }

        return ( pair == 1 ) ;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("\nEnter the Number : ");
        int a = sc.nextInt();

        boolean ans = consecutiveSetBits( a );
        if( ans ) System.out.println("\n !! YES There exists only one pair of consecutive set bits .");
        else System.out.println("\n !! NO There DON'T exists only one pair of consecutive set bits .");
    }
}
