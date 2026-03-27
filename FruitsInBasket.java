import java.util.HashMap;
import java.util.Scanner;

public class FruitsInBasket {
    
    public static int totalFruit(int[] fruits) {
        
        int maxCount = 0 ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        int l = 0 , r = 0 ;

        while( r < fruits.length ){

            map.put( fruits[r] , map.getOrDefault( fruits[r] , 0 ) + 1 );

            if( map.size() > 2 ){

                map.put( fruits[l] , map.get( fruits[l] ) - 1 );
                if( map.get( fruits[l] ) == 0 ) map.remove( fruits[l] );

                l++ ;
            }

            if( map.size() <= 2 && maxCount < r - l + 1){

                maxCount = r - l + 1 ;
            }

            r++ ;
        }

        return maxCount ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        System.out.println("\nEnter no of Trees : ");
        int n = sc.nextInt() ;

        int[] fruits = new int[n];

        System.out.println("\nEnter fruits  :");
        for (int i = 0; i < n; i++) {

            fruits[i] = sc.nextInt();
        }

        int ans = totalFruit( fruits );
        System.out.println("\nThe maximum no of fruits collected is : " + ans );
    }
}
