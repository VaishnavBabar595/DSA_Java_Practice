import java.util.* ;

public class OperationsToTransformString {
    
    public static int minOperations(String s) {
        
        boolean[] arr = new boolean[26] ;
        for( int i = 0 ; i < s.length() ; i++ ){

            arr[ s.charAt(i) - 'a' ] = true ;
        }

        int ans = 0 ;
        int next = 26 ;

        for( int i = 25 ; i > 0 ; i-- ){

            if( arr[i] ){

                ans += next - i ;
                next = i ;
            }
        }

        return ans ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in ) ;
        System.out.println("\nEnter the String : ");
        String s = sc.next() ;

        int ans = minOperations( s ) ;
        System.out.println("\nThe minimum operations required to Transform a to the String containing only 'a' are : " + ans  );
    }
}
