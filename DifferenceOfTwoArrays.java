import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DifferenceOfTwoArrays {
    
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int n : nums1)set1.add(n);
        for(int n : nums2)set2.add(n);

        for(int n: nums1){
            if(set2.contains(n)){
                set1.remove(n);
                set2.remove(n);
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        result.add(new ArrayList<>(set1));
        result.add(new ArrayList<>(set2));
        
        return result;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter number of elements in array 1 : ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];
        System.out.println("\nEnter array-1 elements : ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("\nEnter number of elements in array 2 : ");
        int n2 = sc.nextInt();

        int[] nums2 = new int[n2];
        System.out.println("\nEnter array-1 elements : ");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        List<List<Integer>> ans = findDifference( nums1 , nums2 );

        System.out.println("\nThe Difference in two arrays is : " + ans );

    }

}
