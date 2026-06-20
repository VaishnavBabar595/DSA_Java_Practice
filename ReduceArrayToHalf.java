import java.util.*;

public class ReduceArrayToHalf {
    
    public static int minSetSize(int[] arr) {
        
        int n = arr.length ;

        HashMap<Integer , Integer> map = new HashMap<>() ;
        for( int i = 0 ; i < n ; i++ ){

            map.put( arr[i] , map.getOrDefault( arr[i] , 0 ) + 1 ) ;
        }

        PriorityQueue< Integer > pq = new PriorityQueue<>(

            (a ,b) -> Integer.compare( b , a ) 
        );

        for (Integer key : map.keySet()) {
            
            pq.add( map.get( key ) ) ;
        }

        int sum = 0 ;
        int count = 0 ;

        while( sum < ( n / 2 ) ){

            count++ ;
            sum += pq.poll() ;
        }

        return count ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        int ans = minSetSize( nums1 );
        System.out.println("\nThe minimum number of distinct elements which will be removed to get the size atmost to half are : " + ans );
    }
}
