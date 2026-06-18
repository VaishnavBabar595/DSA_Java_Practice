import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordsArranging {
    
    public static String arrangeWords(String text) {
        
        List<pair> list = new ArrayList<>();

        int strt = 0 ;
        int n = text.length() ;
        StringBuilder sb = new StringBuilder() ;

        for( int i = 0 ; i < n ; i++ ){

            char ch = text.charAt(i) ;
            if( ch == ' ' ){

                list.add( new pair( i - strt , new StringBuilder(sb) ) ) ;
                sb.setLength(0) ;
                strt = i+1 ;
            }
            else sb.append( ch ) ;
        }
        list.add( new pair( n - strt , new StringBuilder(sb) ) ) ;
        Collections.sort(list, (a, b) -> Integer.compare(a.len, b.len));

        StringBuilder ans = new StringBuilder() ;
        int i = 0 ;
        while( i < list.size() ){

            int ln = ans.length() ;
            StringBuilder temp = list.get(i).word ;
            ans.append( temp ) ;
            ans.append( ' ' ) ;
            i++ ;
            ans.setCharAt( ln , Character.toLowerCase( ans.charAt(ln) ) ) ;
        }

        ans.deleteCharAt( ans.length() -1 ) ;
        ans.setCharAt( 0 , Character.toUpperCase( ans.charAt( 0 ) ) ) ;

        return ans.toString() ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in ) ;
        System.out.println("\nEnter the String : ");
        String s = sc.nextLine() ;

        String ans = arrangeWords( s ) ;
        System.out.println("\nThe RE-ARRANGED String is : " + ans );
    }
}

class pair {

    int len ;
    StringBuilder word ;

    pair( int ln , StringBuilder wd ){

        len = ln ;
        word = wd ;
    }
}
