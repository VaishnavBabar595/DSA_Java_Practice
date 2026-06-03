import java.util.Scanner;

public class DominantIndices {
    
    public static int dominantIndices(int[] nums) {
        
        int sum = 0 ;
        int ans = 0 ; 
        int n = nums.length ;

        sum = sum + nums[ n-1 ] ;
        for( int i = n-2 ; i >= 0 ; i-- ){

            double avg = (double) ((double)sum / (n - i -1 )) ;
            if( nums[i] > avg ) ans++ ;

            sum += nums[i] ;
        }

        return ans ;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("\nEnter no of elements : ");
        int a = sc.nextInt();
                
        int[] arr = new int[a];
        System.out.println("\nEnter elements : ");
        for(int i = 0 ; i < a ; i++ ){
            arr[i] = sc.nextInt();
        }

        int ans = dominantIndices( arr );
        System.out.println("\nNumber of Dominant Indices is : " + ans );
    }
}
