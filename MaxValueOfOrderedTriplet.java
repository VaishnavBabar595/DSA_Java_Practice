import java.util.Scanner;

// Here i < j < k  
public class MaxValueOfOrderedTriplet {
    public static long maximumTripletValue(int[] nums) {
        long max = 0;
        int[] maxRight = new int[nums.length];
        maxRight = calculateMaxRight(nums);

        int[] maxLeft = new int[nums.length];
        maxLeft = calculateMaxLeft(nums);

        for(int i = 0 ; i < nums.length  ; i++){
            long sum = maxLeft[i] - nums[i];
            sum *= maxRight[i] ;
            if( max < sum) max = sum ;
        }
        return max ;
    }

    public static int[] calculateMaxRight(int[] nums){
        int[] maxRight = new int[nums.length];
        maxRight[nums.length - 1] = 0 ;
        for(int i = nums.length - 2 ; i >= 0 ; i--){
            maxRight[i] = Math.max( nums[i+1] , maxRight[i+1]);
        }
        return maxRight ;
    }

    public static int[] calculateMaxLeft(int[] nums){
        int[] maxLeft = new int[nums.length];
        maxLeft[0] = 0 ;
        for(int i = 1; i < nums.length ; i++){
            maxLeft[i] = Math.max( nums[i-1] , maxLeft[i-1]);
        }
        return maxLeft ;
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

        long ans = maximumTripletValue( nums ) ;
        System.out.println("\nThe maximum value of Ordered Triplet is : "+ ans);
    }
}
