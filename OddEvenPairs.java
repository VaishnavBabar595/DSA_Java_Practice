import java.util.Scanner;

public class OddEvenPairs {
    
    public static void main (String[] args)
	{

        Scanner sc = new Scanner( System.in ) ;
        System.out.println("\nEnter the number : ");
        long n = sc.nextLong() ;
            
        long even = n / 2 ;
        long odd = n / 2 ;
            
        if( n % 2 == 1 ) odd++ ;
            
        System.out.println("\nThe number of odd ans even pairs is : " + even * odd * 2 ) ;
	}
}
