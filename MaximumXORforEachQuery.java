import java.util.Scanner;

public class MaximumXORforEachQuery {
    
    public static int[] getMaximumXor(int[] nums, int maximumBit) {
        int max = (1 << maximumBit) - 1;
        int[] ans = new int[nums.length];

        int XOR = 0 ;
        int j = nums.length - 1;
        for( int i = 0 ; i < nums.length ; i++){

            XOR = XOR ^ nums[i] ;
            ans[j] = XOR ^ max ;
            j--;
        }

        return ans ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter number of elements : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("\nEnter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("\nEnter number of MAXIMUM BITS : ");
        int maxbits = sc.nextInt();

        int[] ans = getMaximumXor( nums , maxbits);

        System.out.println("\nThe answer is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + "\t");
        }

    }
}
