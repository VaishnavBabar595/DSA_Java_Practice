import java.util.Arrays;
import java.util.Scanner;

public class HIndex {
    
    public static int hIndex(int[] citations) {

        Arrays.sort( citations );
        int n = citations.length ;

        for( int i = 0 ; i < n ; i++ ){

            int h = n - i ;
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0 ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter number of research papers :");
        int n = sc.nextInt();

        int[] citations = new int[n];

        System.out.println("\nEnter citations for every paper :");
        for (int i = 0; i < n; i++) {
            citations[i] = sc.nextInt();
        }
        
        int result = hIndex(citations);

        System.out.println("\nH-Index is: " + result);
    }
}
