import java.util.Scanner;

public class StrongPairXOR {
    
    public static int maximumStrongPairXor(int[] nums) {
        
        int xor = 0 ;
        for( int i = 0 ; i < nums.length ; i++ ){

            for( int j = i+1 ; j < nums.length ; j++ ){

                if( Math.abs( nums[i] - nums[j]) <= Math.min( nums[i] , nums[j])) {

                    xor = Math.max( xor , nums[i] ^ nums[j]);
                }
            }
        }

        return xor ;
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

        int ans = maximumStrongPairXor( nums );
        System.out.println("\nThe maximum XOR of Strong Elements : " + ans );

    }
}
