import java.util.* ;

public class AllAnagrams {
    
    public static List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans = new ArrayList<>() ;
        int[] freq = new int[26];
        int n = p.length() ;

        for( int i = 0 ; i < n ; i++ ){

            freq[ p.charAt(i) - 'a' ]++ ;
        }

        int[] freq1 = new int[26];
        for( int i = 0 ; i < n && i < s.length() ; i++ ){

            freq1[ s.charAt(i) - 'a' ]++ ;
        }

        if( Arrays.equals( freq , freq1 ) ) ans.add(0);

        for( int i = 0 ; i < s.length() - n ; i++ ){

            freq1[ s.charAt(i) - 'a' ]-- ;
            freq1[ s.charAt( i+n ) - 'a' ]++ ;

            if( Arrays.equals( freq , freq1 ) ) ans.add(i+1); ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the string : ");
        String s = sc.next();

        System.out.println("\nEnter the string-2 : ");
        String p = sc.next(); 
        
        List<Integer> ans = findAnagrams( s, p );
        System.out.println("\nThe anagrams are at index positions : " + ans );
    }
}
