import java.util.HashMap;
import java.util.Scanner;

public class SubArraySumEqualK {

    // this function returns no of sub arrays which have sum equal k
    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements in array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target sum : ");
        int k = sc.nextInt();

        int ans = subarraySum(nums, k);
        System.out.println("\nThe no. of subarrays which have target sum " + k + " is " + ans);
    }
}
