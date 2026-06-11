import java.util.Scanner;

public class IsPossible {
    
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner( System.in ) ;
        int t = 1 ;
        
        while( t-- > 0 ){
            
            System.out.println("\nEnter a : ");
            int a = sc.nextInt() ;

            System.out.println("\nEnter b : ");
            int b = sc.nextInt() ;

            System.out.println("\nEnter x : ");
            int x = sc.nextInt() ;
            
            int diff = Math.abs( a-b ) ;
            System.out.print("\nIs it possible to equalize a and b by adding x in one and substacting x in other at same time : ");
            if( diff % x != 0 || (diff / x ) % 2 == 1 ) System.out.println("NO");
            else System.out.println("YES");
        }
	}
}
