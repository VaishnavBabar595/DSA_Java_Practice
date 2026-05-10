import java.util.Arrays;
import java.util.Scanner;

public class MatrixScore {
    
    public static int matrixSum(int[][] nums) {
        
        for( int i = 0 ; i < nums.length ; i++ ){

            Arrays.sort( nums[i] );
        }

        int ans = 0 ;
        for( int j = nums[0].length -1 ; j >= 0 ; j-- ){

            int max = Integer.MIN_VALUE ;
            for( int i = 0 ; i < nums.length ; i++ ){

                if( max < nums[i][j] ) max = nums[i][j];
            }
            ans += max ;
        }

        return ans ;
    }

    public static void main(String[] args) {

        // Creating matrix 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int n = sc.nextInt();
        System.out.println("Enter no. of columns : ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        System.out.println("Enter matrix elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //Printing Matrix
        System.out.println();
        System.out.println("Original matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int ans = matrixSum( matrix );
        System.out.println("\nThe score of matrix is : " + ans );
    }
}
