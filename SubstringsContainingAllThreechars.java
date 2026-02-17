import java.util.Scanner;

public class SubstringsContainingAllThreechars {
    
    public static int numberOfSubstrings(String s) {
        
        int[] lastSeen = {-1 , -1 , -1};
        int count = 0 ;

        for(int i = 0 ; i < s.length() ; i++){

            lastSeen[ s.charAt(i) - 'a'] = i ;
            count = count + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2])) + 1;

        }
        return count ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the String ( containing only 'a' , 'b'  'c' ): ");
        String s = sc.nextLine();

        int ans = numberOfSubstrings(s);
        System.err.println("The number of substring containing all three characters : " + ans);

    }
}
