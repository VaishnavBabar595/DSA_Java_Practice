
import java.util.Scanner;

public class FriendsOfAppropriateAges {
    
    public static int numFriendRequests(int[] ages) {

        int[] freq = new int[121];
        for( int i = 0 ; i < ages.length ; i++ ){
            freq[ages[i]]++ ;
        }

        int count = 0 ;

        for( int i = 1 ; i < 121 ; i++ ){

            if( freq[i] == 0) continue ;
            for( int j = 1 ; j < 121 ; j++ ){

                if( freq[j] == 0) continue ;
                if(
                    j > 0.5 * i + 7 &&
                    j <= i &&
                    !(j > 100 && i < 100))
                    {

                    count = count + freq[j] * freq[i] ;

                    if (i == j) {
                        count -= freq[i]; 
                    }
                }
            }
        }
        return count ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter number of friends : ");
        int n = sc.nextInt();

        int[] ages = new int[n];
        System.out.println("\nEnter ages of friends : ");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        int ans = numFriendRequests( ages);
        System.out.println("\nThe number of requests sent is : " + ans);
    }
}
