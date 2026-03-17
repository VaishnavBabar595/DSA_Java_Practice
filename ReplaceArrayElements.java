import java.util.HashMap;
import java.util.Scanner;

public class ReplaceArrayElements {
    
    public static int[] arrayChange(int[] nums, int[][] operations) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        for( int i = 0 ; i < nums.length ; i++ ){

            map.put( nums[i] , i );
        }

        for( int i = 0 ; i < operations.length ; i++ ){

            int k = map.get(operations[i][0]);
            nums[k] = operations[i][1];
            map.put(operations[i][1], k);
        }

        return nums;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter size of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("\nEnter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("\nEnter number of operations:");
        int m = sc.nextInt();
        int[][] operations = new int[m][2];

        System.out.println("\nEnter operations ( oldValue and new Value ):");
        for (int i = 0; i < m; i++) {
            System.out.println("Enter opertion number "+ (i+1) + " : ");
            operations[i][0] = sc.nextInt();
            operations[i][1] = sc.nextInt();
        }

        int[] result = arrayChange(nums, operations);

        System.out.println("\nThe new updated array :");

        for (int num : result) {

            System.out.print(num + " ");
        }

    }
}
