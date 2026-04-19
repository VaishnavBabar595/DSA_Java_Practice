import java.util.Scanner;
import java.util.Stack;

public class DailyTempreture {
    
    public static int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length ;
        int[] ans = new int[n] ;

        Stack<Integer> s = new Stack<>() ;
        for( int i = n-1 ; i >= 0 ; i-- ){

            while( !s.isEmpty() && temperatures[s.peek()] <= temperatures[i] ){

                s.pop() ;
            }
            if( !s.isEmpty() ){

                ans[i] = s.peek() - i ;
            }
            s.push( i );
        }

        return ans ;
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

        int[] ans = dailyTemperatures( nums1 );
        System.out.println("\nThe next warmer day for each : ");
        for (int i = 0; i < n1; i++) {

            System.out.print("\t" + ans[i] );
        }
        System.out.print("\t");
    }

}
