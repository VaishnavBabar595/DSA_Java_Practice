import java.util.Scanner;

public class LongestReapeatingCharacterWithReplacement {
    public static int characterReplacement(String s, int k) {
        int l = 0, r = 0 , maxlen = 0 , maxfreq = 0 ;
        int[] freq = new int[26];

        while(r < s.length()){
            char ch = s.charAt(r) ;
            freq[ch - 'A']++ ;
            maxfreq = Math.max( maxfreq , freq[ch - 'A']);

            if( r - l + 1 - maxfreq > k){

                freq[s.charAt(l) - 'A']--;
                l++ ;
            }
            else{
                maxlen = Math.max( maxlen ,r - l + 1 );
            }
            r++ ;
        }

        return maxlen ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the String : ");
        String s = sc.nextLine();

        System.out.println("\nEnter the no of replacements : ");
        int k = sc.nextInt();

        int ans = characterReplacement( s , k );
        System.err.println("\nThe maximum length of reapeating characters with replating "+k+" characters is "+ ans );
    }
}
