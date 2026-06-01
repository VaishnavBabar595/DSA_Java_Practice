import java.util.Arrays;
import java.util.Scanner;

public class MinimumCost {
    
    public static int minimumCost(int[] cost) {
        
        int ans = 0 ;
        Arrays.sort( cost ) ;

        for( int i = cost.length -1 ; i >= 0 ; i-- ){

            ans += cost[i--] ;
            if( i >= 0 ) ans += cost[i--] ;
        }

        return ans ;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("\nEnter no of candies : ");
        int a = sc.nextInt();
                
        int[] arr = new int[a];
        System.out.println("\nEnter cost of candies : ");
        for(int i = 0 ; i < a ; i++ ){
            arr[i] = sc.nextInt();
        }

        int ans = minimumCost( arr );
        System.out.println("\nMinimum cost to buy all candies is : " + ans );
    }
}
