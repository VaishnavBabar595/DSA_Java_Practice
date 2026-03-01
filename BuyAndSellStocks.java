import java.util.Scanner;

public class BuyAndSellStocks {
    
    public static int maxProfit(int[] prices) {
        int profit = 0 ;
        
        for( int i = 0 ; i < prices.length ; i++ ){

            if( i < prices.length-1 && prices[i] < prices[ i+1 ]){

                profit += prices[ i+1 ] - prices[i] ;
            }
        }

        return profit ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter number of Days : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("\nEnter Prices : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = maxProfit( nums );
        System.out.println("\nThe maximum PROFIT : " + ans );

    }
}
