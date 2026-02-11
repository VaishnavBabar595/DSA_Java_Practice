import java.util.Scanner;

public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        boolean left = true ;
        boolean right = true ;
        for(int i = 0; i < nums.length ; i++){
            left = true ;
            right = true ;
            if( i > 0 && nums[i-1] >= nums[i]){
                continue ;
            }
            if( i < nums.length-1 && nums[i+1] >= nums[i]){
                continue ;
            }
            if(left && right){
                return i ;
            }
        }
        return 0 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements in array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = findPeakElement(nums);
        System.out.println("\nThe index of PEAK element is : " + ans);
    }
}
