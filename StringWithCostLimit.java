import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringWithCostLimit {
    
    public static List<String> generateValidStrings(int n, int k) {
        
        List<String> ans = new ArrayList<>() ;
        backTrack( n , k , ans , 0 , 0 , 0 , new StringBuilder() ) ;
        return ans ;
    }

    public static void backTrack( int n , int k , List<String> ans , int prev ,int idx , int sum , StringBuilder sb ){

        if( sb.length() == n ){

            ans.add( sb.toString() );
            return ;
        }

        int x = sb.length() ;

        sb.append(0);
        backTrack( n , k , ans , 0 , idx + 1 , sum , sb ) ;
        sb.deleteCharAt(x);

        if( (sum + idx) <= k && prev == 0 ){

            sb.append(1);
            backTrack( n , k , ans , 1, idx + 1 , sum + idx , sb ) ;
            sb.deleteCharAt(x);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("\nEnter the length of Strings : ");
        int n = sc.nextInt();

        System.out.println("\nEnter the CostLimit : ");
        int k = sc.nextInt();

        List<String> ans = generateValidStrings( n, k ) ;
        System.out.println("\nThe Binary Strings of length n and within costlimit are : \n " + ans );
    }

}
