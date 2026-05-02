import java.util.Scanner;

public class GreaterAndSmallerElements {
    
    public static int countElements(int[] nums) {
        
        int n = nums.length ;
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE ;

        for( int i = 0 ; i < n ; i++ ){

            if( min > nums[i] ) min = nums[i] ;
            if( max < nums[i] ) max = nums[i] ;
        }

        int count = 0 ;
        for( int i = 0 ; i < n ; i++ ){

            if( min < nums[i] && nums[i] < max ) count++ ;
        }

        return count ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter array elements ( 0's , 1's , 2's ): ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        int ans = countElements( nums1 );
        System.out.println("\nElements strictly greater and smaller : " + ans );
    }
}
