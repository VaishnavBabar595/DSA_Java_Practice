import java.util.Scanner;

public class SpiralMatrix {
    
    public static int[][] generateMatrix(int n) {

        int[][] mat = new int[n][n];

        int startCol = 0 ;
        int endCol = n ;
        int startRow = 0 ;
        int endRow = n ;

        int i = 0 ;
        int j = 0 ;
        int count = 1 ;

        while(startCol < endCol && startRow < endRow){
            i = startRow ;
            for(j = startCol ; j < endCol ; j++){
                mat[i][j] = count ;
                count++;
            }
            j = endCol - 1;
            for(i = startRow + 1 ; i < endRow ; i++){
                mat[i][j] = count;
                count++;
            }
            i = endRow - 1 ;
            for(j = endCol-2 ; j >= startCol ; j--){
                mat[i][j] = count;
                count++;
            }
            j = startCol ;
            
            for(i = endRow-2 ; i > startCol ; i--){
                mat[i][j] = count;
                count++;
            }

            startRow++ ;
            endRow-- ;

            startCol++ ;
            endCol-- ; 
        }
        return mat ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number : ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        mat = generateMatrix(n);
        System.out.println("\nThe spiral Matrix of N x N : \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
