import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubarrayWithKDifferentIntegers {
    
    public static int subarraysWithKDistinct(int[] nums, int k) {
        
        return countSubarrays(nums , k) - countSubarrays(nums , k-1) ;
    }

    static int countSubarrays(int nums[],int k){
        Map<Integer,Integer>m=new HashMap<>();
        int left=0;
        int count=0;
        for(int right=0;right<nums.length;right++){
            m.put(nums[right],m.getOrDefault(nums[right],0)+1);
            while(m.size()>k){
                m.put(nums[left],m.get(nums[left])-1);
                if(m.get(nums[left])==0){
                    m.remove(nums[left]);
                }
                left++;
            }
            count+=right-left+1;
        }
        return count;
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

        System.out.println("\nEnter the no of replacements : ");
        int k = sc.nextInt();

        long ans = subarraysWithKDistinct( nums , k ) ;
        System.out.println("\nThe number of arrays with "+ k +"different elemints is : "+ ans);
    }
}
