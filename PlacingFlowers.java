import java.util.Scanner;

public class PlacingFlowers {
    
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        if( n == 0 ) return true ;
        
        for( int i = 0 ; i < flowerbed.length ; i++ ){

            if( flowerbed[i] == 1 ) continue ;

            if( ( i > 0 && flowerbed[i-1] == 1 ) || (i < flowerbed.length-1 && flowerbed[i+1] == 1 ) ) continue ;

            flowerbed[i] = 1 ;
            n-- ;

            if( n == 0 ) return true ;
        }

        return false ;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("\nEnter no of pots : ");
        int a = sc.nextInt();
                
        int[] arr = new int[a];
        System.out.println("\nEnter pot status ( 0 or 1 ) : ");
        for(int i = 0 ; i < a ; i++ ){
            arr[i] = sc.nextInt();
        }

        System.out.println("\nEnter no of plants : ");
        int n = sc.nextInt();

        boolean ans = canPlaceFlowers( arr , n );
        
        if( ans ) System.out.println("\nYES we plant all the flowers in given trees alternatively .");
        else System.out.println("\nWe CAN'T plant the given trees .");
    }
}
