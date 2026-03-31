
import java.util.*;

public class SingleElementInSortedArray {
    
    public static int singleNonDuplicate(int[] nums) {
        
        int n =  nums.length ;
        if( n == 1) return nums[0];

        int l = 0 , r = n - 1;

        while( l < r){

            int mid = l + ( r - l ) / 2;

            boolean flag = true ;
            if( mid > 0 && nums[mid] == nums[mid - 1]) flag = false ;
            else if( mid < n-1 && nums[mid] == nums[mid + 1]) flag = false ;

            if( flag ) return nums[mid] ;

            int leftLen = mid - l ;
            int rightLen = r - mid ;

            if( mid > 0 && nums[mid] == nums[mid - 1]){

                if( (leftLen - 1) % 2 == 0 ){
                    l = mid + 1;
                }
                else{
                    r = mid - 2;
                }
            }
            else {

                if( (rightLen - 1) % 2 == 0 ){
                    r = mid - 1;
                }
                else{
                    l = mid + 2;
                }
            }
        }

        return nums[l];
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        System.out.println("\nEnter no of array elements : ");
        int n = sc.nextInt() ;

        int[] nums = new int[n];

        System.out.println("\nEnter array elements ( one element once other twice ):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort( nums );

        int ans = singleNonDuplicate( nums );
        System.out.println("\nThe single element in sorted array is : " + ans );
    }
}
