import java.util.HashSet;
import java.util.Scanner;

public class ArithmaticTriplets {
    public static int arithmeticTriplets(int[] nums, int diff) {

        int uniqueTriplet = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int n : nums) {
            if (set.contains(n + diff) && set.contains(n + (diff * 2))) {
                uniqueTriplet++;
            }
        }
        return uniqueTriplet;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array ( >= 3): ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("\nEnter the Difference : ");
        int diff = sc.nextInt();

        int ans = arithmeticTriplets( nums, diff) ;
        System.out.println("\nThe number of unique triplets having given difference is : "+ ans);
    }
}
