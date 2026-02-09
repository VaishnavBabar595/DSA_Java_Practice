import java.util.Scanner;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        int l = 0 , r = 0 , count = 0 , minlen = s.length() ;
        int staringIndex = -1 ;
        int[] hash = new int[257];
        for(int i = 0 ; i < t.length() ; i++){
            hash[t.charAt(i)]++;
        }

        while( r < s.length() ){

            char ch = s.charAt(r);
            if(hash[ch] > 0) count++ ;
            hash[ch]-- ;

            while( count == t.length() && l < s.length()){

                if( minlen >= r - l + 1) {
                    minlen = r - l + 1;
                    staringIndex = l ;
                }

                ch = s.charAt(l);
                hash[ch]++ ;
                if(hash[ch] > 0) count-- ;
                l++ ;
            }

            r++ ;
        }
        if(staringIndex == -1) return ("");

        String result = s.substring(staringIndex , staringIndex + minlen );

        return result ; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the 1st String : ");
        String s = sc.nextLine();

        System.out.println("\nEnter the 2nd String : ");
        String t = sc.nextLine();

        String ans = minWindow(s , t);
        System.out.println("The minimum window substring is : " + ans + " with length " + ans.length());

    }
}
