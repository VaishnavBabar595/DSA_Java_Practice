import java.util.Scanner;

public class NoOfSpecialChars {
    
    public static int numberOfSpecialChars(String word) {
        
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];

        for (char ch : word.toCharArray()) {

            if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = true;
            }

            else {
                upper[ch - 'A'] = true;
            }
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {

            if (lower[i] && upper[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );

        System.out.println("\nEnter the String : ");
        String s1 = sc.nextLine();

        int ans = numberOfSpecialChars(s1);
        System.out.println("\nNumber of special characters in the string is : " + ans );
    }
}
