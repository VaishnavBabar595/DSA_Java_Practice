import java.util.Scanner;

public class PeaksHicked {
    
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int t = 1;
 
        while (t-- > 0) {
            
            System.out.println("\nEnter total number of days : ");
            int n = sc.nextInt() ;

            System.out.println("\nEnter number of days to Hick one peak : ");
            int k = sc.nextInt() ;
            int[] nums = new int[n] ;
            
            System.out.println("\nEnter weather on each day ( 0 for normal & 1 for rain ) " );
            for( int i = 0 ; i < n ; i++ ){
                
                nums[i] = sc.nextInt() ;
            }
            
            int ans = 0 ;
            int count = 0 ;
            for( int i = 0 ; i < n ; i++ ){
                
                if( nums[i] == 0 ) count++ ;
                else count = 0 ;
                if( count == k ){
                    
                    ans++ ;
                    count = 0 ;
                    i++ ;
                }
            }
            
            System.out.println( "\nThe Maximum number of peaks hicked is : " + ans ) ;
            
        }
    }
}
