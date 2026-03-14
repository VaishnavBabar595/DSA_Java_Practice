import java.util.HashMap;
import java.util.Scanner;

public class SubarraysWithSumDivisibleByK {
    
    public static int subarraysDivByK(int[] nums, int k) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put( 0 , 1 );

        int sum = 0 ;
        int count = 0 ;
        for( int i = 0 ; i < nums.length ; i++ ){

            sum = (sum + nums[i]) % k;

            if(sum < 0){
                sum += k;
            }

            if( map.containsKey( sum )){

                count = count + map.get( sum ) ;
                map.put( sum , map.get(sum) + 1 );
            }
            else{
                map.put( sum , 1 ) ;
            }
        }
        return count ;
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

        int ans = subarraysDivByK( nums , k) ;
        System.out.println("\nThe number arrays having sum divisible by " + k + " are : " + ans );
    }
}
