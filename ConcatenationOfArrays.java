import java.util.Scanner;

public class ConcatenationOfArrays {
    
    public static int[] getConcatenation(int[] nums) {
        
        int n = nums.length ;
        int[] ans = new int[ n*2 ];
        for( int i = 0 ; i < n ; i++ ){

            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        return ans ;
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

        int[] ans = getConcatenation( nums1 );
        System.out.println("\nThe modified array is :\n");
        for (int i = 0; i < n1; i++) {
            System.out.print("\t" + ans[i] );
        }
        System.out.print("\t");
    }
}
