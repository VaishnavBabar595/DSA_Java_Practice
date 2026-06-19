import java.util.*;

public class ElementsWithAtleastKGreater {
    
    public static int countElements(int[] nums, int k) {
        
        Arrays.sort( nums ) ;
        int count = 0 ;
        int ans = 0 ;
        boolean flag = false ;
        for( int i = nums.length -1 ; i >= 0 ; i-- ){
            
            if( count >= k ) {

                flag = true ;
                ans++ ;
            }
            count++ ;
            while( i > 0 && nums[i] == nums[i-1] ) {

                i-- ;
                count++ ;
                if( flag ) ans++ ;
            }
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

        System.out.println("\nEnter K : ");
        int k = sc.nextInt();

        int ans = countElements( nums1 , k );
        System.out.println("\nThe number of elements in array which have atleast k elements greater than it is : " + ans );
    }
}
