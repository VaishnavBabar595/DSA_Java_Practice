import java.util.Scanner;

public class CanDivideInTwo {
    
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner( System.in ) ;
        int t = 1 ;
        
        while( t-- > 0 ){
            
            System.out.println("\nEnter the String :");
            String s = sc.next() ;

            int n = s.length() ;
            
            if( n % 2 == 1 ) {
                
                System.out.println("NO! string cannot be divided into two equal parts .");
                continue ;
            }
            
            int[] freq = new int[26] ;
            for( int i = 0 ; i < n ; i++ ){
                
                freq[ s.charAt(i) - 'a' ]++ ;
            }
            
            boolean flag = true ; 
            for( int i = 0 ; i < 26 ; i++ ){
                
                if( freq[i] % 2 == 1 ){
                    
                    flag = false ;
                    break ;
                }
            }
            
            if( flag ) System.out.println("YES! string can be divided into two equal parts .");
            else System.out.println("NO! string cannot be divided into two equal parts .");
        }
	}
}
