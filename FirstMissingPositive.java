import java.util.Scanner;

public class FirstMissingPositive {
    
    public static int firstMissingPositive(int[] nums) {
        
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while ( nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i] ) {

                int idx = nums[i] - 1;

                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
        }

        for (int i = 0; i < n; i++) {

            if (nums[i] != i + 1) {
                
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter number of array elements :");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("\nEnter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = firstMissingPositive( nums );
        System.out.println("\nThe first missing posive is : " + ans );

    }
}
