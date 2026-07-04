import java.util.Scanner;

public class TimeToSolveProblems {
    
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner( System.in ) ;
        int t = 1 ;
        
        while( t-- > 0 ){
            
            System.out.println("\nEnter no. of Problems : ");
            long n = sc.nextLong() ;

            System.out.println("\nEnter duration of break : ");
            long b = sc.nextLong() ;

            System.out.println("\nEnter time taken to solve a Problem : ");
            long m = sc.nextLong() ;
            
            long ans = 0 ;
            
            while( n > 0 ){
                
                if( n % 2 == 1 ){
                    
                    n = n / 2 ;
                    ans = ans + ( n+1 ) * m + b ;
                    m = m * 2 ;
                }
                else{
                    
                    n = n / 2 ;
                    ans = ans + n * m + b ;
                    m = m * 2 ;
                }
            }
            
            ans -= b ;
            System.out.println( "\nThe time needed to solve all problems is : " + ans ) ;
        }
	}
}
