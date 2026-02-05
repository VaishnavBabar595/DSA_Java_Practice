import java.util.Scanner;

public class MaxConseecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0 ;
        int max = 0 ;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] == 1) count++;
            else count = 0 ;

            if(max < count) max = count;
        }
        return max ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements (only 0 or 1): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = findMaxConsecutiveOnes( nums ) ;
        System.out.println("\nThe length of maximum 1's is : "+ ans);
    }
}
