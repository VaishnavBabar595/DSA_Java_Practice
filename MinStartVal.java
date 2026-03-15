import java.util.Scanner;

public class MinStartVal {
    
    public static int minStartValue(int[] nums) {
        
        int prefix = 0;
        int lowest = 0;
        for( int i = 0 ; i < nums.length ; i++ ){
            prefix += nums[i] ;
            if( lowest > prefix ) lowest = prefix ;
        }

        return ( 0 - lowest + 1);
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

        int ans = minStartValue( nums ) ;
        System.out.println("\nThe minimum start value to maintain prefix sum atlest 1 is : " + ans );
    }
}
