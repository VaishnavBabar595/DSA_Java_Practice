import java.util.Scanner;

public class CountOfPalindromicSubstrings {
    
    public static int countSubstrings(String s) {
        
        int count = 0;

        for( int i = 0 ; i < s.length() ; i++ ){

            count += palindromeLength( s , i , i ) ;
            count += palindromeLength( s , i , i+1 ) ;
        }

        return count ;
    }

    public static int palindromeLength( String s , int x , int y ){

        int count = 0 ;
        if( x == y ){

            x-- ;
            y++ ;
            count++ ;
        }

        while( x > -1 && y < s.length() && s.charAt( x ) == s.charAt( y ) ){

            x-- ;
            y++ ;
            count++ ;
        }

        return count ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        System.out.println("\nEnter the String : ");
        String s = sc.nextLine();

        int ans = countSubstrings( s );

        System.out.println("\nThe total number of PALINDROMIC substring is : " + ans );
    }
}
