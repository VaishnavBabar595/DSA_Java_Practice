import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortEvenAndOddIndices {
    
    public static int[] sortEvenOdd(int[] nums) {
        
        List<Integer> odds = new ArrayList<>() ;
        List<Integer> evens = new ArrayList<>() ;

        for( int i = 0 ; i < nums.length ; i++ ){

            if( i % 2== 0){
                evens.add( nums[i]);
            }
            else{
                odds.add( nums[i] );
            }
        }

        Collections.sort( odds , Collections.reverseOrder());
        Collections.sort( evens );

        int odd = 0 ;
        int even = 0 ;

        for( int i = 0 ; i < nums.length ; i++ ){

            if( i % 2== 0){
                nums[i] = evens.get( even );
                even++ ;
            }
            else{
                nums[i] = odds.get( odd );
                odd++ ;
            }
        }

        return nums ;
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
        
        int[] ans = sortEvenOdd( nums );
        System.out.println("\nThe array after sorting nums at odd indices and even indices Indipendently : " );
        for (int i = 0; i < n; i++) {
            System.out.print("\t"+ ans[i]);
        }
    }
}
