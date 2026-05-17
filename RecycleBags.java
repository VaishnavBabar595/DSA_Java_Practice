import java.util.*;

public class RecycleBags {
     
    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("\nEnter no of bags : ");
            int a = sc.nextInt();

            System.out.println("\nEnter capacity : ");
            int b = sc.nextInt();
                
            int[] arr = new int[a];
            System.out.println("\nEnter weights of bags : ");
            for(int i = 0 ; i < a ; i++ ){
                arr[i] = sc.nextInt();
            }
                
            Arrays.sort( arr );
            int mul = 1 ;
            int count = 0 ;
            for( int i = a-1 ; i >= 0 ; i-- ){
                    
                if( arr[i]*mul <= b ){
                        
                    mul = mul*2 ;
                    count++ ;
                }
            }
            System.out.println("\nThe number of coins needed is " + ( a - count ));
            
        }
}
