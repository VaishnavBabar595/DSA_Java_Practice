import java.util.Scanner;

public class NumberOfIslands {
    
    public static int numIslands(char[][] grid) {
        
        int count = 0 ;

        for( int i = 0 ; i < grid.length ; i++ ){

            for( int j = 0 ; j < grid[i].length ; j++ ){

                if( grid[i][j] == '0' ) continue ;

                count++ ;
                dfs( grid , i , j);
            }
        }

        return count ;
    }

    public static void dfs( char[][] grid , int i , int j ){

        if( i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0' ){

            return ;
        }

        grid[i][j] = '0';

        dfs( grid , i-1 , j);
        dfs( grid , i+1 , j);
        dfs( grid , i , j-1);
        dfs( grid , i , j+1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int n = sc.nextInt();
        System.out.println("Enter no. of columns : ");
        int m = sc.nextInt();
        char[][] matrix = new char[n][m];

        System.out.println("Enter LAND or WATER  ( 0 or 1 ) : ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                matrix[i][j] = sc.next().charAt(0);
            }
        }

        //Printing Matrix
        System.out.println();
        System.out.println("The GRID is : ");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int ans = numIslands( matrix );
        System.out.println("\nThe no of ISLANDS is : " + ans +"\n");
    }
}
