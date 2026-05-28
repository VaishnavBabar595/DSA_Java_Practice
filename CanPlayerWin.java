import java.util.* ;

public class CanPlayerWin {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEnter the string : ");
        String str = sc.next() ;
            
        Stack<Character> s = new Stack<>() ;
        for( int i = 0 ; i < str.length() ; i++ ){
                
            char ch = str.charAt(i);
                
            if( !s.isEmpty() && s.peek() == ch ) s.pop() ;
            else s.push( ch );
        }
        
        System.out.print("\nCan the player Win : ");
        if( ! s.isEmpty() ) System.out.print( "NO" );
        else System.out.println( "Yes" );
    }
}
