import java.util.Scanner;

public class LargestSpecialCharacter {
    
    public static String greatestLetter(String s) {
        
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];

        for (char ch : s.toCharArray()) {

            if (Character.isLowerCase(ch)) {

                lower[ch - 'a'] = true;
            }

            else {
                upper[ch - 'A'] = true;
            }
        }

        int count = 0;
        for (int i = 25; i >= 0 ; i-- ) {

            if (lower[i] && upper[i]) {
                
                char ch = (char)('A'+ i );
                return Character.toString(ch);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );

        System.out.println("\nEnter the String : ");
        String s1 = sc.nextLine();

        String ans = greatestLetter(s1);
        System.out.println("\nLargest special characters in the string is : " + ans );
    }
}
