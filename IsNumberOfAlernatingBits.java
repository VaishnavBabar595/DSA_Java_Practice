import java.util.Scanner;

public class IsNumberOfAlernatingBits {
    
    public static boolean hasAlternatingBits(int n) {
        
        boolean flag = (( n & 1 ) != 0 ) ;
        n = ( n >> 1 ) ;

        while( n != 0 ){

            if( ( n & 1 ) != 0 && flag ) return false ;
            else if( !(( n & 1 ) != 0) && !flag ) return false ;

            flag = !flag ;
            n = ( n >> 1 ) ;
        }

        return true ;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("\nEnter the number : ");
        int n = sc.nextInt();
        
        boolean ans = hasAlternatingBits(n);
        if( ans ) System.out.println("\nNumber has ALERNATING set bits .");
        else System.out.println("\nNumber DO NOT have ALERNATING set bits .");
    }
}
