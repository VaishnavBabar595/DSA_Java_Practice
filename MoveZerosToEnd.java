import java.util.Scanner;

public class MoveZerosToEnd {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int insertposition = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[insertposition] = nums[i];
                insertposition++;
            }
        }
        while (insertposition < n) {
            nums[insertposition] = 0;
            insertposition++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        moveZeroes(nums);
        System.out.println("After moving zeros : ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
