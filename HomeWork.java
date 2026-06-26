import java.util.*;
public class HomeWork {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int t = 1 ;
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
            String a = sc.next() ;
            int n2 = sc.nextInt() ;
            String b = sc.next() ;
            String d = sc.next() ;
            
            StringBuilder sb = new StringBuilder( a ) ;
            for( int i = 0 ; i < n2 ; i++ ){
                
                char ch = b.charAt(i) ;
                char w = d.charAt(i) ;
                
                if( w == 'V' ) sb.insert( 0 , ch );
                else sb.append(ch) ;
            }
            
            System.out.println( sb ) ;
        }
    }
}
