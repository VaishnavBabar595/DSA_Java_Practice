import java.util.HashMap;
import java.util.Scanner;

public class ContineusSubarraySum {
    
    public static boolean checkSubarraySum(int[] nums, int k) {
        
        if( nums.length == 1) return false ;

        HashMap< Integer , Integer> map = new HashMap<>() ;
        map.put( 0 , 0);

        int sum = 0 ;
        for( int i = 0 ; i < nums.length ; i++ ){

            sum = sum + nums[i] % k;
            sum = sum % k ;
            if( map.containsKey( sum )){
                if( i - map.get(sum) >= 1) {
                    if( nums[i] == 0 && nums[i-1] != 0 && nums[i-1] % k!= 0){
                        continue ;
                    }
                    else if( nums[i] % k == 0 && nums[i-1] % k!= 0){
                        continue ;
                    }
                    return true ;
                }
            }
            map.put( sum , i);
        }
        return false ;
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

        System.out.println("\nEnter divisor : ");
        int k = sc.nextInt();

        boolean ans = checkSubarraySum( nums , k) ;

        if( ans ){
            System.out.println("\nThe array HAS atlest one subarray who's sum is disible by k .");
        }
        else{
            System.out.println("\nThe array DO NOT HAVE atlest one subarray who's sum is disible by k .");
        }
    }
}
