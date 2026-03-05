import java.util.Scanner;

public class ReturnToBoundry {
    
    public static int returnToBoundaryCount(int[] nums) {
        int position = 0;
        int count = 0;
        
        for (int num : nums) {
            position += num;
            if (position == 0) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter number of Elements : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("\nEnter Array Elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int ans = returnToBoundaryCount( nums );
        System.out.println("\nThe number of times returns to boundry is : " + ans );
    }
}
