import java.util.*;

public class TopKFrequentElements {
    
    public static int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer , Integer> map1 = new HashMap<>();
        for( int i = 0 ; i < nums.length ; i++ ){

            map1.put( nums[i] , map1.getOrDefault( nums[i] , 0 ) + 1 );
        }
        
        int[][] arr = new int[ map1.size() ][2];
        int j = 0 ;
        for( int i : map1.keySet() ){

            arr[j][0] = i;
            arr[j][1] = map1.get(i);
            j++;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        int[] ans = new int[k];
        j = arr.length -1 ;

        for( int i = 0 ; i < k ; i++ ){

            ans[i] = arr[j][0];
            j-- ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("\nEnter K : ");
        int k = sc.nextInt();

        int[] ans = topKFrequent(nums, k);
        System.out.println("\nThe top k most frequent elements are : ");
        for (int i = 0; i < k; i++) {
            System.out.print("\t" + ans[i] );
        }
        System.out.println("");
    }
}
