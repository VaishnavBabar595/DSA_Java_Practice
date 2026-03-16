import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateMaximumDistance {
    
    public static int maxDistance(List<List<Integer>> arrays) {

        int maxi = arrays.get(0).get( arrays.get(0).size() -1) ;
        int mini = arrays.get(0).get(0) ;
        int result = 0;
        
        for( int i = 1 ; i < arrays.size() ; i++ ){

            List<Integer> arr = arrays.get(i);

            int currMax = arr.get( arr.size() -1);
            int currMin = arr.get( 0);

            result = Math.max( result , Math.abs( maxi - currMin));
            result = Math.max( result , Math.abs( currMax - mini));

            if( maxi < currMax ) maxi = currMax ;
            if( mini > currMin ) mini = currMin ;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of arrays: ");
        int n = sc.nextInt();

        List<List<Integer>> arrays = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter size of array " + (i + 1) + ": ");
            int m = sc.nextInt();

            List<Integer> list = new ArrayList<>();

            System.out.println("Enter elements (sorted) of array " + (i + 1) + ":");

            for (int j = 0; j < m; j++) {
                list.add(sc.nextInt());
            }

            arrays.add(list);
        }

        int ans = maxDistance(arrays);

        System.out.println("Maximum Distance: " + ans);
    }
}
