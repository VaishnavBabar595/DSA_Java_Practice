import java.util.Arrays;
import java.util.Scanner;

public class DistroyingAsteroids {
    
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        
        long masses = mass ;
        Arrays.sort( asteroids ) ;

        int i = 0 ;
        for( i = 0 ; i < asteroids.length ; i++ ){

            if( masses < asteroids[i] ) break ;
            masses += asteroids[i] ;
        }

        return i == asteroids.length ;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("\nEnter no of asteroids : ");
        int a = sc.nextInt();

        System.out.println("\nEnter mass of planet : ");
        int mass = sc.nextInt();
                
        int[] arr = new int[a];
        System.out.println("\nEnter weights of asteroids : ");
        for(int i = 0 ; i < a ; i++ ){
            arr[i] = sc.nextInt();
        }

        boolean ans = asteroidsDestroyed( mass , arr );
        System.out.println("\nCan planet survive : " + ans );
    }
}
