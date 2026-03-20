import java.util.Scanner;

public class LeastFrequentDigit {
    
    public static int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];
        while( n > 0 ){
            freq[ n % 10 ]++ ;
            n = n / 10 ;
        }

        int min = Integer.MAX_VALUE;
        int num = 0;
        for( int i = 0 ; i < 10 ; i++){

            if( min > freq[i] && freq[i] != 0){
                min = freq[i];
                num = i ;
            }
        }
        
        return num ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter number :");
        int n = sc.nextInt();

        int ans = getLeastFrequentDigit( n );
        System.out.println("\nThe least appering digit is : " + ans );
    }
}
