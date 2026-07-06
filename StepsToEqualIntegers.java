import java.util.Scanner;

public class StepsToEqualIntegers {
    
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int t = 1;
 
        while (t-- > 0) {
            
            System.out.println("\nEnter first integer : ");
            int a = sc.nextInt() ;

            System.out.println("\nEnter second integer : ");
            int b = sc.nextInt() ;
            
            System.out.print("\nThe number of Steps required to equal these integers is : ");
            if( a == b ) System.out.println( 0 );
            else if( a % b == 0 ) System.out.println( 1 );
            else if( b % a == 0 ) System.out.println( 1 );
            else System.out.println( 2 );
        }
    }
}
