import java.util.Scanner;

public class NoOfSetBits {
    
    public static int hammingWeight(int n) {
        
        int count = 0 ;
        while( n != 0 ){

            if( ( n & 1 ) != 0 ) count++ ;
            n = ( n >> 1 ) ;
        }

        return count ;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("\nEnter the Number : ");
        int a = sc.nextInt();

        int ans = hammingWeight( a );
        System.out.println("\nThe number of set bits in given integer is : " + ans );
    }
}
