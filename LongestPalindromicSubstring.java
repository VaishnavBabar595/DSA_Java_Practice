import java.util.Scanner;

public class LongestPalindromicSubstring {
    
    public static String longestPalindrome(String s) {

        int maxlen = 0 ;
        String[] result = new String[1];
        for( int i = 0 ; i < s.length() ; i++ ){

            String s1 = palindromeLength( s , i , i ) ;
            String s2 = palindromeLength( s , i , i+1 );

            int currMax = Math.max( s1.length() , s2.length() );
            
            if( currMax == s1.length() ){

                if( maxlen < currMax ){

                    maxlen = currMax ;
                    result[0] = s1 ;
                }
            }
            else{
                if( maxlen < currMax ){

                    maxlen = currMax ;
                    result[0] = s2 ;
                }
            }
        }

        return result[0] ;
    }

    public static String palindromeLength( String s , int x , int y ){

        if( x == y ){

            x-- ;
            y++ ;
        }

        while( x > -1 && y < s.length() && s.charAt( x ) == s.charAt( y ) ){

            x-- ;
            y++ ;
        }

        return s.substring( x +1 , y ) ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        System.out.println("\nEnter the String : ");
        String s = sc.nextLine();

        String ans = longestPalindrome( s );

        System.out.println("\nThe longest PALINDROMIC substring is : " + ans );
    }
}
