import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combination {
    
    public static List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> result = new ArrayList<>() ;
        permutations(n, new ArrayList<>() , k , 1 , result);

        return result ;
    }

    public static void permutations( int n, List<Integer> ans , int k , int start , List<List<Integer>> result){

        if( k == ans.size() ){

            result.add(new ArrayList<>( ans ) );
            return ;
        }

        for( int i = start ; i <= n ; i++ ){

                ans.add( i );
                permutations(n , ans , k , i+1 , result );
                ans.remove( ans.size() - 1 );
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        
        System.out.println("\nEnter the range number [] 1 to n ] : ");
        int n = sc.nextInt();

        System.out.println("\nEnter the length of combination : ");
        int k = sc.nextInt();

        List<List<Integer>> ans = combine( n, k);
        System.out.println("\nThe combinations in range 1 to " + n + " having length " + k + " are : \n" + ans);
    }
}
