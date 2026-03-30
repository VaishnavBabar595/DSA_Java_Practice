import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DNAsequencing {
    
    public static List<String> findRepeatedDnaSequences(String s) {
        
        
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        for( int i = 0 ; i <= s.length() - 10 ; i++ ){

            if( !set1.add( s.substring(i , i+10 ))){

                set2.add( s.substring(i , i+10 ) );
            }
        }

        return new ArrayList<String>(set2) ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        System.out.println("\nEnter the DNA sequence ( only having A , B , C , T ) : ");
        String s = sc.nextLine();

        List<String> ans = findRepeatedDnaSequences( s );

        System.out.println("\nThe repeated DNA sequences are : \n" + ans );
    }
}
