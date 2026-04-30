import java.util.Scanner;

public class StaircaseFilledRows {
    
    public static int arrangeCoins(int n) {
        
        long i = 1 ;
        while( ( i * (i+1) ) / 2 <= n){
            i++ ;
        }
        return (int)i-1 ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number : ");
        int n1 = sc.nextInt();

        int ans = arrangeCoins( n1 );
        System.out.println("\nThe number rows filled in staircase model is : " + ans );
    }
}
