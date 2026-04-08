import java.util.Scanner;

public class MaxProductOfTwoElements {
    
    public static int maxProduct(int[] nums) {
        
        int max = Integer.MIN_VALUE ;
        int secondMax = Integer.MIN_VALUE ;

        for( int i = 0 ; i < nums.length ; i++ ){

            if( max <= nums[i]-1 ){

                secondMax = max ;
                max = nums[i]-1 ;
            }
            else if( secondMax < nums[i]-1 ){

                secondMax = nums[i]-1;
            }
        }

        return max * secondMax ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements ( > 0 ): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans  = maxProduct( nums );
        System.out.println("\nThe maximum product after each reduced by one : " + ans );
    }
}
