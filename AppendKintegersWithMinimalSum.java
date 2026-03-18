import java.util.Arrays;
import java.util.Scanner;

public class AppendKintegersWithMinimalSum {
    
    public static long minimalKSum(int[] nums, int k) {

        Arrays.sort( nums );
        long sum = (long) k * (k+1) / 2 ;
        for(int i = 0 ; i < nums.length && k >= nums[i]; i++ ){

            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if( nums[i] <= k){

                sum -= nums[i];
                sum += ++k ;
            }
        }

        return sum ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter number of Banned elements :");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("\nEnter Banned elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("\nEnter number of sum elements :");
        int k = sc.nextInt();

        long ans = minimalKSum( nums , k );
        System.out.println("\nMinimum sum for adding K integers without banned elements is : " + ans );
    }
}
