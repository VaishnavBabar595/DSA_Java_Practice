import java.util.Arrays;
import java.util.Scanner;

public class MaxNumberGame {
    
    public static int[] numberGame(int[] nums) {
        
        int n = nums.length ;
        Arrays.sort( nums );
        for( int i = 0 ; i < n ; i += 2 ){

            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        int[] ans = numberGame( nums1 );
        System.out.println("\nThe modified array is :\n");
        for (int i = 0; i < n1; i++) {
            System.out.print("\t" + ans[i] );
        }
        System.out.print("\t");
    }
}
