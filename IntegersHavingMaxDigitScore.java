
import java.util.Scanner;

public class IntegersHavingMaxDigitScore {
    
    public static int maxDigitRange(int[] nums) {
        
        int n = nums.length ;
        int[] score = new int[n] ;
        int max = 0 ;

        for( int i = 0 ; i < n ; i++ ){

            int max1 = 0 ;
            int min = 10 ;
            int x = nums[i] ;
            while( x > 0 ){

                int a = x % 10 ;
                x = x / 10 ;
                max1 = Math.max( max1 , a );
                min = Math.min( min , a );
            }

            score[i] = max1 - min ;
            max = Math.max( max , score[i] ) ;
        }

        int sum = 0 ;
        for( int i = 0 ; i < n ; i++ ){

            if( score[i] == max ) sum += nums[i] ;
        }

        return sum ;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        System.out.println("\nEnter number of integers : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("\nEnter Integers : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt() ;
        }

        int ans = maxDigitRange( arr ) ;
        System.out.println("\nThe sum of Integers having Max digit score : " + ans );
    }
}
