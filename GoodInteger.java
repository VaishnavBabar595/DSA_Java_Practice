import java.util.* ;

public class GoodInteger {
    
    public static boolean checkGoodInteger(int n) {
        
        int sum = 0 ;
        int square = 0 ;

        while( n > 0 ){

            int digit = n % 10 ;
            sum += digit ;
            square = square + ( digit * digit ) ;
            n = n / 10 ;
            if( square - sum >= 50 ) return true ;
        }

        return false ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in ) ;
        System.out.println("\nEnter the Integer value : " );
        int n = sc.nextInt() ;

        if( checkGoodInteger( n ) ) System.out.println("\n" + n + " is a GOOD Integer .");
        else System.out.println("\n" + n + " is NOT a Good Integer");
    }
}
