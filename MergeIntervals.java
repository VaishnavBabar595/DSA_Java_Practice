import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeIntervals {
    
    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] current = intervals[0];
        result.add( current );

        for( int i = 1 ; i < intervals.length ; i++ ){

            int[] next = intervals[i];
            if( next[0] <= current[1] ){
                if( next[1] > current[1] ) current[1] = next[1] ;
            }
            else{
                current = next ;
                result.add( current );
            }

        }
        
        return result.toArray( new int[ result.size() ][]) ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter number of intervals : ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2] ;
        for( int i = 0 ; i < n ; i++){

            System.err.println("Enter [" + i +"] [" + 0 +"] : " );
            intervals[i][0] = sc.nextInt();
            
            System.err.println("Enter [" + i +"] [" + 1 +"] : " );
            intervals[i][1] = sc.nextInt();
        }

        int[][] ans = merge( intervals);
        System.err.println("The MERGED intervals are : " + Arrays.deepToString(ans));
    }
}
