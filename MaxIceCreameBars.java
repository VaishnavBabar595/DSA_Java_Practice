import java.util.Scanner;

public class MaxIceCreameBars {
    
    public static int maxIceCream(int[] costs, int coins) {
        
        int[] freq = new int[100001] ;
        for( int i = 0 ; i < costs.length ; i++ ){

            freq[ costs[i] ]++ ;
        }

        int ans = 0 ;
        for( int i = 1 ; i < 100001 ; i++ ){

            if( freq[i] == 0 ) continue ;

            int ct = freq[i] ;
            while( ct-- > 0 ){

                coins -= i ;
                if( coins < 0 ) break ;
                ans++ ;
            }

            if( coins <= 0 ) break ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of ice cream bars : ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter cost of each bar : ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("\nEnter the Number of COINS : ");
        int coins = sc.nextInt();

        int ans = maxIceCream( nums1 , coins );
        System.out.println("\nThe maximum number of bars we can buy is : " + ans );
    }
}
