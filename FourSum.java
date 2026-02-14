import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length ;

        for( int i = 0 ; i < n; i++){

            if (nums[i] > target && nums[i] >= 0) return ans ;
            if( i > 0 && nums[i-1] == nums[i]) continue ;

            for( int j = i+1 ; j < n ; j++){

                if( j > i+1 && nums[j] == nums[j-1]) continue ;

                int k = j+1;
                int l = n -1 ;

                while( k < l ){

                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l] ;

                    if( sum == target){

                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]) ;
                        temp.add(nums[j]) ;
                        temp.add(nums[k]) ;
                        temp.add(nums[l]) ;

                        ans.add(temp);

                        k++;
                        l--;

                        while( k < l && nums[k] == nums[k-1]) k++;
                        while( k < l && nums[l] == nums[l+1]) l--;
                    }

                    else if( sum < target) k++;
                    else l-- ;
                }
            }
        }

        return ans ;
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

        System.out.println("\nEnter the target : ");
        int target = sc.nextInt();

        List<List<Integer>> ans = fourSum( nums , target);
        System.err.println("The quads with sum equal to " + target + " are : " + ans);
    }
}
