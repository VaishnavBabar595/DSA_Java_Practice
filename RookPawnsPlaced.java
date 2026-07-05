import java.util.Scanner;

public class RookPawnsPlaced {
    
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner( System.in ) ;
        int t = 1 ;
        
        while( t-- > 0 ){
            
            System.out.println("\nEnter board length : ");
            long n = sc.nextInt() ;
            if( n == 1 ) System.out.println( "\nMaximim RookPawns that can be Planed are : " + n );
            else if( n <= 3 ) System.out.println( "\nMaximim RookPawns that can be Planed are : " + (n-1) );
            else System.out.println( "\nMaximim RookPawns that can be Planed are : " + n ) ;
        }
	}
}
