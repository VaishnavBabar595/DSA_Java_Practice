import java.util.Scanner;

public class MinimumPathSum {
    
    public static int minPathSum(int[][] grid) {

        int[][] dp = new int[ grid.length ][ grid[0].length ];
        pathSum( dp , grid );
        return dp[0][0] ;
    }
    public static void pathSum(int[][] dp , int[][] grid){
        
        int m = dp.length -1 ;
        int n = dp[0].length -1 ;

        for( int i = m ; i >= 0 ; i-- ){

            for( int j = n ; j >= 0 ; j-- ){

                if( j+1 > n ) {

                    if( i+1 > m ){

                        dp[i][j] = grid[i][j] ;
                    }
                    else{

                        dp[i][j] = dp[i+1][j] + grid[i][j] ;
                    }
                }
                else if( i+1 > m ) {

                    dp[i][j] = dp[i][j+1] + grid[i][j] ;
                }
                else{

                    int left = dp[i][j+1] ;
                    int right = dp[i+1][j] ;

                    dp[i][j] = grid[i][j] + Math.min( left , right ) ;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Creating matrix 
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter no. of rows : ");
        int n = sc.nextInt();

        System.out.println("\nEnter no. of columns : ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        System.out.println("\nEnter values of elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //Printing Matrix
        System.out.println();
        System.out.println("\nOriginal grid : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int ans = minPathSum( matrix );
        System.out.println("\nThe minimum path sum to reach the bottom right is : " + ans );
    }
}
