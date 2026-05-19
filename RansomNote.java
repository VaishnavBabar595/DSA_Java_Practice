import java.util.Scanner;

public class RansomNote {
    
    public static boolean canConstruct(String ransomNote, String magazine) {
        
        int n = ransomNote.length() ;
        int[] freq = new int[26];

        for( int i = 0 ; i < n ; i++ ){

            int idx = ransomNote.charAt(i) - 'a' ;
            freq[idx]++ ;
        }

        for( int i = 0 ; i < magazine.length() ; i++ ){

            int idx = magazine.charAt(i) - 'a' ;
            
            if( freq[idx] > 0 ){

                n-- ;
                freq[idx]-- ;
            }
            if( n == 0 ) return true ;
        }
        return false ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );

        System.out.println("\nEnter the Ransom Note : ");
        String s1 = sc.nextLine();

        System.out.println("\nEnter the Magazine : ");
        String s2 = sc.nextLine();

        boolean ans = canConstruct( s1 , s2 );
        System.out.println("\nCan we construct a Ransom Note from Magazine : " + ans );
    }
}
