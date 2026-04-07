import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {
    
    public static String largestNumber(int[] nums) {
        
        String[] str = new String[ nums.length ];

        for( int i = 0 ; i < nums.length ; i++ ){

            str[i] = String.valueOf( nums[i] );
        }
        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));

        if ( str[0].equals("0") ) return "0";

        StringBuilder sb = new StringBuilder();
        for( int i = 0 ; i < nums.length ; i++ ){

            sb.append( str[i] );
        }

        return sb.toString() ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        String ans  = largestNumber( nums );
        System.out.println("\nThe largest number is : " + ans );
    }
}
