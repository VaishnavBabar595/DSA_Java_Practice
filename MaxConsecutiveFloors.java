import java.util.Arrays;
import java.util.Scanner;

public class MaxConsecutiveFloors {
    

    public static int maxConsecutive(int bottom, int top, int[] special) {
        
        Arrays.sort( special );
        int max = special[0] - bottom ;
        int n = special.length ;
        for( int i = 1 ; i < n ; i++ ){
            max = Math.max( max , special[i] - special[i-1] - 1) ;
        }

        max = Math.max( max , top - special[ n -1]) ;

        return max ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the bottom floor  : ");
        int bottom = sc.nextInt();
        
        System.out.println("\nEnter the Top floor  : ");
        int top = sc.nextInt();

        System.out.println("\nEnter number of special floors : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("\nEnter the special floors between BOTTOM and TOP : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = maxConsecutive( bottom , top , nums);
        System.out.println("\nThe maximum consecutive floors without special floors is : " + ans );

    }
}
