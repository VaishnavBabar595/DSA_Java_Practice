import java.util.Scanner;

public class PartitionArrayAccordingToPivot {
    
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int less = 0 ;
        int equal = 0 ;
        int greater = 0 ;

        for( int i = 0 ; i < nums.length ; i++ ){

            if( nums[i] < pivot) less++ ;
            else if ( nums[i] == pivot) equal++ ;
            else greater++ ;
        }

        int[] ans = new int[ nums.length ];

        int idxLess = 0 ;
        int idxEqual = less ;
        int idxGreater = less + equal ;

        for( int i = 0 ; i < nums.length ; i++ ){

            if( nums[i] < pivot) {
                ans[ idxLess ] = nums[i] ;
                idxLess++ ;
            }
            else if ( nums[i] == pivot){
                ans[ idxEqual ] = nums[i] ;
                idxEqual++ ;
            }
            else {
                ans[ idxGreater ] = nums[i] ;
                idxGreater++ ;
            }
        }

        return ans ;
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

        System.out.println("\nEnter PIVOT Element : ");
        int pivot = sc.nextInt();

        int[] ans = pivotArray( nums , pivot );
        System.out.println("\nThe array after partition according PIVOT :");
        for (int i = 0; i < n; i++) {
            System.out.print("\t"+ ans[i]);
        }
    }
}
