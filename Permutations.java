import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>() ;
        permutations(nums, 0 , result);

        return result ;
    }

    public static void permutations( int[] nums , int idx , List<List<Integer>> result ){

        if( idx == nums.length ){

            ArrayList<Integer> list = new ArrayList<>();
            for (int s : nums) {
                list.add(s);
            }
            result.add( list );
            return ;
        }

        for( int i = idx ; i < nums.length ; i++ ){

            swap( idx , i , nums );
            permutations(nums, idx + 1 , result);
            swap( idx , i , nums );
        }
        
    }

    public static void swap( int i , int j , int[] nums ){

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter number of Elements ( <= 6 ): ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("\nEnter Array Elements (unique): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> ans = permute( nums) ;
        System.out.println("\nThe permutatins of give elements are : \n" + ans );
    }
}
