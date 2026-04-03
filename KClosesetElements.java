import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KClosesetElements {
    
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int l = 0 ;
        int r = arr.length - 1 ;

        while( r - l + 1 > k){

            if( Math.abs( x - arr[l]) > Math.abs( x - arr[r])){
                l++ ;
            }
            else{
                r--;
            }
        }

        List<Integer> result = new ArrayList<>() ;
        while( l <= r ){

            result.add( arr[l] );
            l++ ;
        }

        return result;
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

        System.out.println("\nEnter K : ");
        int k = sc.nextInt();

        System.out.println("\nEnter X : ");
        int x = sc.nextInt();

        List<Integer> ans = findClosestElements( nums , k , x );
        System.out.println("\nThe K closest Elements to x are : \n" + ans);


    }
}
