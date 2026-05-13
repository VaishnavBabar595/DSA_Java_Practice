import java.util.HashSet;
import java.util.Scanner;

public class CountResiduePrefix {
    
    public static int residuePrefixes(String s) {
        HashSet<Character> set = new HashSet<>() ;
        int residue = 0 ;
        for( int i = 0 ; i < s.length() ; i++ ){

            char ch = s.charAt( i );
            set.add( ch );
            if( set.size() == ( (i+1) % 3 ) ) residue++ ;
        }

        return residue ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );

        System.out.println("\nEnter the string : ");
        String s = sc.nextLine();

        int ans = residuePrefixes( s );
        System.out.println("\nThe residue is " + ans );
    }
}
