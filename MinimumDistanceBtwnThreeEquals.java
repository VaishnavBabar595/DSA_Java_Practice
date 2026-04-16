import java.util.HashMap;
import java.util.Scanner;

public class MinimumDistanceBtwnThreeEquals {
    
    public static int minimumDistance(int[] nums) {
        
        HashMap<Integer , Integer> map = new HashMap<>() ;
        int[] last = new int[ nums.length ] ;

        for( int i = 0 ; i < nums.length ; i++ ){

            if( map.containsKey( nums[i] ) ){

                last[i] = i - map.get( nums[i] );
            }
            else{

                last[i] = -1 ;
            }

            map.put( nums[i] , i ) ; 
        }

        int min = -1 ;

        for( int i = 0 ; i < nums.length ; i++ ){

            if( last[i] == -1 ) continue ;
            
            int idx = i - last[i] ;
            if( last[ idx ] == -1 ) continue ;

            int distance = last[i]*2 + last[ idx ]*2 ;

            if( min > distance || min == -1 ) min = distance ;
        }

        return min ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        int ans = minimumDistance( nums1 );
        System.out.println("\nMinimum distance btwn three equals is : " + ans );
    }
}
