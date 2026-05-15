import java.util.Arrays;
import java.util.Scanner;

public class CheckIfArrayIsGood {
    
    public static boolean isGood(int[] nums) {
        
        Arrays.sort( nums );
        int n = nums.length  ;

        int i = 0 ;
        for( i = 0 ; i < n-1 ; i++ ){

            if( nums[i] != i+1 ) return false ;
        }
        if( nums[i] != i ) return false ;
        return true ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements : ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter elements : ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        boolean ans = isGood(nums1);
        System.out.println("\nIs array a good array : " + ans );
    }
}
