import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortVowelsInString {
    
    public static String sortVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowels.add(ch);
            }
        }

        Collections.sort(vowels);
        StringBuilder sb = new StringBuilder("");
        int j = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                sb.append( vowels.get(j));
                j++;
            }
            else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the String : ");
        String s = sc.nextLine();

        String ans = sortVowels(s);
        System.err.println("The string after sorting the vowels is : " + ans);
    }
}
