import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayToMaximizeScore {
    
    // Score of an array is no of indices having +ve prefix sum 
    public static int maxScore(int[] nums) {

        Arrays.sort(nums);

        long prefix = 0;
        int score = 0;

        for(int i = nums.length - 1; i >= 0; i--){
            
            prefix += nums[i];
            if(prefix > 0) score++;
            else break;
        }

        return score;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter number of Elements : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("\nEnter Array Elements (unique): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = maxScore( nums) ;
        System.out.println("\nThe maximum score after rearranging is : " + ans );
    }
}
