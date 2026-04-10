import java.util.Scanner;

public class MinComman {
    
    public static int getCommon(int[] nums1, int[] nums2) {
        
        int ans = -1, left=0;

        for(int right =0; right < nums1.length; right++) {

            while(left < nums2.length-1 &&nums2[left] < nums1[right]) {

                left++;
            }
            if(nums1[right] == nums2[left]) {
                
                ans= nums1[right];
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array-1 : ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter array-1 elements : ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("\nEnter the Number of elements in array-2 : ");
        int n2 = sc.nextInt();

        int[] nums2 = new int[n2];

        System.out.println("Enter array-2 elements : ");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int ans = getCommon( nums1, nums2) ;
        System.out.println("\nThe minimum comman of two arrays is : " + ans );
    }
}
