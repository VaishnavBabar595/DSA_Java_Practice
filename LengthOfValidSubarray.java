import java.util.Scanner;
import java.util.Stack;

public class LengthOfValidSubarray {
    
    public static int validSubarraySize(int[] nums, int threshold) {
        
        int n = nums.length ;

        int[] left = leftSmaller( nums );
        for( int i = 0 ; i < n ; i++ ){
            System.out.print( "\t" + left[i] );
        }

        System.out.println() ;
        int[] right = rightSmaller( nums );
        for( int i = 0 ; i < n ; i++ ){
            System.out.print( "\t" + right[i] );
        }

        for( int i = 0 ; i < n ; i++ ){

            int k = right[i] - left[i] -1;
            double div = (double) threshold / k ;

            if( (double) nums[i] > div ){

                return k ;
            }
        }

        return -1 ;
    }

    public static int[] leftSmaller( int[] nums ){

        int n = nums.length ;
        int[] ans = new int[n];

        ans[ 0 ] = -1 ;
        Stack<Integer> s = new Stack<>() ;
        s.push(0);

        for( int i = 1 ; i < n ; i++ ){

            while( !s.isEmpty() && nums[ s.peek() ] >= nums[i] ){

                s.pop() ;
            }
            if( s.isEmpty() ){

                ans[i] = -1 ;
            }
            else{

                ans[i] = s.peek() ;
            }

            s.push(i) ;
        }

        return ans ;
    }

    public static int[] rightSmaller( int[] nums ){

        int n = nums.length ;
        int[] ans = new int[n];

        ans[ n-1 ] = n ;
        Stack<Integer> s = new Stack<>() ;
        s.push(n-1);

        for( int i = n-2 ; i >= 0 ; i-- ){

            while( !s.isEmpty() && nums[ s.peek() ] >= nums[i] ){

                s.pop() ;
            }
            if( s.isEmpty() ){

                ans[i] = n ;
            }
            else{

                ans[i] = s.peek() ;
            }

            s.push(i) ;
        }

        return ans ;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("\nEnter no of elements : ");
        int a = sc.nextInt();

        System.out.println("\nEnter threshold : ");
        int threshold = sc.nextInt();
                
        int[] arr = new int[a];
        System.out.println("\nEnter elements : ");
        for(int i = 0 ; i < a ; i++ ){
            arr[i] = sc.nextInt();
        }

        int ans = validSubarraySize( arr , threshold );
        System.out.println("\nLength of valid subarray is : " + ans );
    }
}
