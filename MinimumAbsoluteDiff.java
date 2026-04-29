import java.util.* ;

public class MinimumAbsoluteDiff {
    
    public static int minAbsoluteDifference(int[] nums) {
        
        int n = nums.length ;
        int diff = -1 ;
        int[] arr = new int[n];
        int one = -1 ;
        int two = -1 ;
        for( int i = 0 ; i < n ; i++ ){

            if( nums[i] == 1 ){

                if( two != -1 ){
                    arr[i] = i - two ;
                }
                else{
                    arr[i] = -1 ;
                }
                one = i ;
            }
            else if( nums[i] == 2 ){

                if( one != -1 ){
                    arr[i] = i - one ;
                }
                else{
                    arr[i] = -1 ;
                }
                two = i ;
            }
            else{
                arr[i] = -1 ;
            }
        }
        for( int i = 0 ; i < n ; i++ ){

            if( ( diff > arr[i] || diff == -1 ) && arr[i] != -1 ) diff = arr[i] ;
        }
        return diff ;
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

        int ans = minAbsoluteDifference( nums1 );
        System.out.println("\nThe minimum difference between 1 and 2 is : " + ans );
    }
}
