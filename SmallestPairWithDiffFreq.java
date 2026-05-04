import java.util.Scanner;

public class SmallestPairWithDiffFreq {
    
    public static int[] minDistinctFreqPair(int[] nums) {
        
        boolean flag = false ;
        int x =  -1 ;
        int freqX = 0 ;
        int y = -1 ; 
        int freqY = 0 ;

        int[] freq = new int[101];
        for( int i = 0 ; i < nums.length ; i++ ){

            freq[nums[i]]++ ;
        }

        int i = 1 ;
        for( i = 1 ; i < 101 ; i++ ){

            if( freq[i] != 0 ){
                x = i ;
                freqX = freq[i] ;
                break ;
            }
        }
        i++ ;
        while( i < 101 ){

            if( freq[i] != 0 && freq[i] != freqX ){
                y = i ;
                flag = true ;
                break ;
            }
            i++ ;
        }

        if( flag ){

            return new int[]{ x , y };
        }

        return new int[]{ -1 , -1 };
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter array elements ( 0's , 1's , 2's ): ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        int[] ans = minDistinctFreqPair( nums1 );
        System.out.println("\nSmallest Pair With Different Frequency : ");
        for( int i = 0 ; i < n1 ; i++ ){

            System.out.print(ans[i] + "\t");
        }
        System.out.println("");
    }
}
