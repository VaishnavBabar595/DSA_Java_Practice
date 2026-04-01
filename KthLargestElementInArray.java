import java.util.*;

public class KthLargestElementInArray {
    
    public static int findKthLargest(int[] nums, int k) {
        
        PriorityQueue< Integer > pq = new PriorityQueue<>();

        for( int i = 0 ; i < nums.length ; i++ ){

            pq.add( nums[i] );

            if( pq.size() > k ){
                pq.poll();
            }
        }

        return pq.poll();
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

        System.out.println("\nEnter K : ");
        int k = sc.nextInt();

        int ans = findKthLargest(nums, k);
        System.out.println("\nThe kth maximum is : "+ ans);
    }
}
