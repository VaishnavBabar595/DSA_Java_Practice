import java.util.Scanner;

public class FormNumber {
    
    public static String maxSumOfSquares(int num, int sum) {
        
        if( sum > ( num * 9 ) ) return "";

        StringBuilder sb = new StringBuilder() ;
        while( sum > 0 || num > 0 ){

            if( sum == 0 ) sb.append(0);
            num-- ;
            if( sum >= 9 ){

                sum -= 9 ;
                sb.append(9);
            }
            else if( sum >= 8 ){

                sum -= 8 ;
                sb.append(8);
            }
            else if( sum >= 7 ){

                sum -= 7 ;
                sb.append(7);
            }
            else if( sum >= 6 ){

                sum -= 6 ;
                sb.append(6);
            }
            else if( sum >= 5 ){

                sum -= 5 ;
                sb.append(5);
            }
            else if( sum >= 4 ){

                sum -= 4 ;
                sb.append(4);
            }
            else if( sum >= 3 ){

                sum -= 3 ;
                sb.append(3);
            }
            else if( sum >= 2 ){

                sum -= 2 ;
                sb.append(2);
            }
            else if( sum >= 1 ){

                sum -= 1 ;
                sb.append(1);
            }
        }

        return sb.toString() ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        System.out.println("\nEnter number of digits : ");
        int n = sc.nextInt() ;

        System.out.println("\nEnter digit sum : ");
        int sum = sc.nextInt() ;

        String ans = maxSumOfSquares( n , sum ) ;
        System.out.println("\nThe Number having Max digit score , n digits & gives digit sum is : " + ans );
    }
}
