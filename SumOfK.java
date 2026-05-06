import java.util.Scanner;

public class SumOfK {
    
    public static int[] decrypt(int[] code, int k) {
        
        int n = code.length;
        int[] ans = new int[n];

        if (k == 0) return ans;

        int sum = 0;
        
        if (k > 0) {
            for (int i = 1; i <= k; i++) {
                sum += code[i % n];
            }

            for (int i = 0; i < n; i++) {
                ans[i] = sum;
                sum -= code[(i + 1) % n];
                sum += code[(i + k + 1) % n];
            }
        }
        
        else {
            k = -k;

            for (int i = 1; i <= k; i++) {
                sum += code[(n - i) % n];
            }

            for (int i = 0; i < n; i++) {
                ans[i] = sum;
                sum -= code[(n + i - k) % n];
                sum += code[i % n];
            }
        }

        return ans;
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

        System.out.println("\nEnter K : ");
        int k = sc.nextInt();

        int[] ans = decrypt( nums1 , k);
        System.out.println("\nAnswer array is  : ");
        for( int i = 0 ; i < n1 ; i++ ){

            System.out.print(ans[i] + "\t");
        }
        System.out.println("");
    }
}
