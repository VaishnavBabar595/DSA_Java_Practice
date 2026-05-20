import java.util.HashMap;
import java.util.Scanner;

public class NumberOfWinners {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the number of players : ");
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        
        System.out.println("\nEnter score of players : ");
        for( int i = 0 ; i < n ; i++ ){
                    
            int a = sc.nextInt() ;
            map.put( a , map.getOrDefault( a , 0 ) +1 ) ;
            if( max < a ) max = a ;
        }
                
        System.out.println( "\nThe number of winners is : " + map.get( max ) ) ;
    }
}
