import java.util.Scanner;

public class ScoreDifference {
    
    public static int scoreDifference(int[] nums) {
        
        int score = 0 ;
        boolean flag = false ;
        int count = 1 ;
        for( int i = 0 ; i < nums.length ; i++ ){

            if( count % 6 == 0 ) flag = !flag ;
            if( nums[i] % 2 != 0 ) flag = !flag ;

            if( flag ) score -= nums[i] ;
            else score += nums[i] ;

            count++ ;
        }

        return score ;
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

        int ans = scoreDifference(nums1);
        System.out.println("\nThe score difference is : " + ans );
    }
}
