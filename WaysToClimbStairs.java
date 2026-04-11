import java.util.Scanner;

public class WaysToClimbStairs {
    
    //Either we can take ( 2 steps or 1 Step ) at a time 
    public static int climbStairs(int n) {
        
        int[][] dp = new int[n+1][1];

        return ways( n , dp );
    }

    public static int ways( int n , int[][] dp ){

        if( n == 1 || n == 0 ){
            dp[n][0] = 1 ;
            return 1;
        }

        if( dp[n][0] != 0 ) return dp[n][0];

        dp[n][0] += ways( n-1 , dp );
        dp[n][0] += ways( n-2 , dp );

        return dp[n][0] ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter number of stairs ( <= 45 ) : ");
        int n = sc.nextInt();

        int ans = climbStairs( n );
        System.out.println("\nThe total ways to climb n stairs : " + ans );
    }
}
