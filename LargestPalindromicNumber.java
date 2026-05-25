import java.util.Scanner;

public class LargestPalindromicNumber {
    
    public static String largestPalindromic(String num) {
        
        int[] freq = new int[10] ;
        boolean nonZero = true ;

        for( int i = 0 ; i < num.length() ; i++ ){

            char ch = num.charAt(i) ;
            freq[ ch - '0' ]++ ;
            if( ch != '0' && freq[ ch - '0' ] > 1 ) nonZero = false ;
        }

        StringBuilder sb = new StringBuilder() ;

        for( int i = 9 ; i >= 0 ; i-- ){

            if( freq[i] % 2 == 1 ){

                char ch = (char)('0' + i );
                sb.append( ch );
                freq[i]-- ;
                break ;
            }
            else if( i == 0 && freq[0] > 0 && nonZero ) sb.append( 0 ) ;
        }

        if( nonZero ) return sb.toString() ;

        for( int i = 0 ; i < 10 ; i++ ){

            if( freq[i] == 0 || freq[i] == 1 ) continue ;

            char ch = (char)('0' + i );
            while( freq[i] >= 2 ){

                sb.insert(0, ch);
                sb.append( ch );

                freq[i] -= 2 ;
            }
        }

        return sb.toString() ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );

        System.out.println("\nEnter the Number String : ");
        String s1 = sc.nextLine();

        String ans = largestPalindromic(s1);
        System.out.println("\nThe Larget palindromic number : " + ans );
    }
}
