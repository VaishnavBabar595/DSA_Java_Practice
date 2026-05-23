import java.util.* ;
public class StarvationDay {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        System.out.println("\nEnter no of Days : ");
        int n = sc.nextInt();

        System.out.println("\nEnter minimum food intake : ");
        int k = sc.nextInt();

        boolean flag = true ;
        int remain = 0 ;

        System.out.println("\nEnter Day wise food :");
        int i = 0 ;
        for( i = 1 ; i <= n ; i++ ){
                
            int a = sc.nextInt() ;
            if( (a + remain) < k && flag ){
                    
                flag = false ;
                break ;
            }
                
            remain = remain - k + a ;
        }
        
        if( !flag ) System.out.println( "\nYou will starve on Day : " + i );
        else System.out.println( "\nYou will not starve ." ) ;
    }
}
