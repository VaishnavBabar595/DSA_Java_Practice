import java.util.Scanner;

public class ReshapeMatrix {
    
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int n = mat.length ;
        int m = mat[0].length ;

        if (n * m != r * c) return mat;
        
        int[] row = new int[ n*m ];
        int idx = 0 ;
        for( int i = 0 ; i < n ; i++ ){
            for( int j = 0 ; j < m ; j++ ){

                row[idx++] = mat[i][j];
            }
        }

        idx = 0 ;
        int[][] ans = new int[r][c];
        for( int i = 0 ; i < r ; i++ ){
            for( int j = 0 ; j < c ; j++ ){

                ans[i][j] = row[idx++] ;
            }
        }

        return ans ;
    }

    public static void main(String[] args) {
        
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

        System.out.println("Enter no. of new-rows : ");
        int r = sc.nextInt();
        System.out.println("Enter no. of new-columns : ");
        int c = sc.nextInt();

        int[][] ans = matrixReshape( matrix , r, c) ;

        System.out.println();
        System.out.println("Reshaped matrix : ");
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
