import java.util.*;

public class FormingGroup {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in ) ;
        System.out.println("\nEnter number of people : ");
        int n = sc.nextInt() ;
        int[] a = new int[n] ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        System.out.println("\nEnter each persons prefered Group Size : ");   
        for( int i = 0 ; i < n ; i++ ){
                
            a[i] = sc.nextInt() ;
            map.put( a[i] , map.getOrDefault( a[i] , 0 ) + 1 ) ;
        }
            
        boolean flag = true ;
        for( int i = 0 ; i < n ; i++ ){
                
            if( map.get( a[i] ) % a[i] != 0 ) {
                    
                flag = false ;
                break ;
            }            
        }
            
        if( flag ) System.out.println( "\nYES all can be in their prefered group sizes ." );
        else System.out.println( "\nNO all Cann't be in their prefered group sizes ." );
    }
}
