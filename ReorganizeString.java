import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ReorganizeString {
    
    //No like characters should be together 
    public static String reorganizeString(String s) {
        
        int max = 0 ; 
        HashMap<Character , Integer> map = new HashMap<>() ;
        for( int i = 0 ; i < s.length() ; i++ ){

            char ch = s.charAt( i );
            map.put( ch , map.getOrDefault( ch , 0 ) + 1 ) ;
            if( max < map.get( ch )) max = map.get( ch ) ;
        }

        if( max > (s.length() + 1) / 2 ){

            return "";
        }

        PriorityQueue<Character> pq = new PriorityQueue<>(

            (a , b) -> map.get(b) - map.get(a)
        );

        for (char key : map.keySet()) {

            pq.add(key);
        }

        char[] arr = new char[ s.length() ];
        int j = 0 ;

        while( !pq.isEmpty() ){
            
            char ch = pq.poll() ;
            int i = map.get( ch ) ;
            while( i > 0 ){

                if ( j >= s.length() ) {
                    j = 1 ; 
                }

                arr[j] = ch ;
                j += 2 ;
                i-- ;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the string : ");
        String s = sc.next();

        String ans = reorganizeString( s ) ;
        if( ans.length() == 0 ){

            System.out.println("\nThe String cannot be REORANIZED ");
        }
        else{

            System.out.println("\nThe REORGANIZED string is : " + ans );
        }
    }
}
