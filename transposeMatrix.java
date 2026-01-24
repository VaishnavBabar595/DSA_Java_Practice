import java.util.*;
public class transposeMatrix {
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
        // Transposing Matrix 
        int[][] transposeeMatrix = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposeeMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println();
        System.out.println("Transposed matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transposeeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
