import java.util.*;

public class StonesWhichAreJewels {
    
    public static int numJewelsInStones(String jewels, String stones) {
        
        Set<Character> set = new HashSet<>() ;
        HashMap<Character , Integer> map = new HashMap<>() ;

        for( int i = 0 ; i < jewels.length() ; i++ ){

            set.add( jewels.charAt(i) ) ;
        }

        for( int i = 0 ; i < stones.length() ; i++ ){

            char ch = stones.charAt(i) ;
            map.put( ch , map.getOrDefault( ch , 0 ) + 1 ) ;
        }

        int ans = 0 ;
        for( char ch : set ){

            ans += map.getOrDefault( ch , 0 ) ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the jewels : ");
        String jewels = sc.next();

        System.out.println("\nEnter the stones : ");
        String stones = sc.next();

        int ans = numJewelsInStones( jewels , stones );
        System.out.println("\nThe number of stones which are jewels : " + ans );
    }
}
