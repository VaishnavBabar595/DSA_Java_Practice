import java.util.Scanner;

public class ReverseWordsInString {
    public static String reverseWords(String s) {

        StringBuilder sb = new StringBuilder("");
        int start = 0 ;
        while(s.charAt(start) == ' ') start++ ;

        int end = s.length() -1 ;
        while(s.charAt(end) == ' ') end-- ;

        int l = end ;
        for(int i = end ; i >= start ; i-- ){
            if( s.charAt(i) == ' '){

                sb.append( s.substring( i+1 , l+1));
                sb.append(' ');
                while(i >= start && s.charAt(i) == ' ') i-- ;
                l = i ;
                i++ ;
            }
            else if( i == start) sb.append( s.substring( i , l+1));
        }

        return (sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the String : ");
        String str = sc.nextLine();

        String ans = reverseWords(str);
        System.err.println("\nReversed string without reversing the words is : " + ans);
    }
}
