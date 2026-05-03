import java.util.Scanner;

public class OppositeParity {
    
    public static int[] countOppositeParity(int[] nums) {
        
        int odd = 0 ;
        int even = 0 ;
        int n = nums.length ;
        int[] ans = new int[n];

        for( int i = n-1 ; i >= 0 ; i-- ){

            if( nums[i] % 2 == 0 ){

                ans[i] = odd ;
                even++ ;
            }
            else{

                ans[i] = even ;
                odd++ ;
            }
        }

        return ans ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter array elements ( 0's , 1's , 2's ): ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        int[] ans = countOppositeParity( nums1 );
        System.out.println("\nOpposite parity : ");
        for( int i = 0 ; i < n1 ; i++ ){

            System.out.print(ans[i] + "\t");
        }
        System.out.println("");
    }
}
