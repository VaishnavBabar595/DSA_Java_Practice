import java.util.Scanner;

public class NoOfBalloons {
 
    public static int maxNumberOfBalloons(String text) {
        
        int[] freq = new int[26] ;
        for( int i = 0 ; i < text.length() ; i++ ){

            freq[ text.charAt(i) - 'a' ]++ ;
        }

        int b = freq[1] ;
        int a = freq[0] ;
        int l = freq[ 'l' - 'a' ] ;
        int o = freq[ 'o' - 'a' ] ;
        int n = freq[ 'n' - 'a' ] ;

        int ans = Math.min( a , Math.min( Math.min( b , n ) , Math.min( l / 2 , o / 2 ) ) ) ;
        return ans ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Text : ");
        String s = sc.next();

        int ans = maxNumberOfBalloons( s );
        System.out.println("\nThe maximum number of Balloon word that can be made from text are : " + ans );
    }
}
