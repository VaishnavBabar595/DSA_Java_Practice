import java.util.* ;
public class ReversePrefix {
    
    public static String reversePrefix(String s, int k) {
        
        StringBuilder sb = new StringBuilder(s);
        int l = 0 ;
        int r = k-1 ; 

        while( l < r ){

            char ch1 = sb.charAt(l);
            sb.setCharAt( l , sb.charAt(r) );
            sb.setCharAt( r , ch1 );

            r-- ;
            l++ ;
        }

        return sb.toString() ;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in ) ;
        System.out.println("\nEnter the String : ");
        String s = sc.next() ;
        
        System.out.println("\nEnter k : ");
        int k = sc.nextInt() ;

        String ans = reversePrefix( s , k ) ;
        System.out.println("\nThe resulting string is : " + ans );
    }
}
