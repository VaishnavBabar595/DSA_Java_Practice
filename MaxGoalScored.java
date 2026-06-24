import java.util.Scanner;

public class MaxGoalScored {
    
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner( System.in ) ;
        int t = 1 ;
        
        while( t-- > 0 ){
            
            System.out.println("\nEnter number of player : ");
            int n = sc.nextInt() ;
            int[] a = new int[n] ;
            
            System.out.println("\nEnter goal scored by each player : ");
            for( int i = 0 ; i < n ; i++ ){
                
                a[i] = sc.nextInt() ;
                a[i] *= 20 ;
            }
            
            int max = 0 ;
            System.out.println("\nEnter fauls by each player : ");
            for( int i = 0 ; i < n ; i++ ){
                
                a[i] = a[i] - ( sc.nextInt() * 10 ) ;
                max = Math.max( max , a[i] ) ;
            }
            
            System.out.println( "\nMaximum score by any player is : " + max ) ;
            
        }
	} 
}
