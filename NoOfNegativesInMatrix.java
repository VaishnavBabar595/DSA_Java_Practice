import java.util.Scanner;

public class NoOfNegativesInMatrix {

    // Counts negatives in O(m+n) 
    public static int countNegatives(int[][] grid) {
        int count = 0;
        int m = 0;                                      // row
        int n = grid[0].length - 1;                     // column
        while (m < grid.length && n >= 0) {
            if (grid[m][n] < 0) {
                count = count + (grid.length - m);
                n--;
            } else {
                m++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {

        // Creating matrix 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int n = sc.nextInt();
        System.out.println("\nEnter no. of columns : ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        System.out.println("\nThe Matrix should be sorted in Non-Decreasing Order.\nEnter matrix elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //Printing Matrix
        System.out.println();
        System.out.println("\nOriginal matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int no = countNegatives(matrix);
        System.out.println("\nThe number of Negatives in matrix are : " + no );
    }
}
