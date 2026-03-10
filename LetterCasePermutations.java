import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCasePermutations {
    

    public static List<String> letterCasePermutation(String s) {

        List<String> output = new ArrayList<>();
        cobinations( s.toCharArray(),0,output );
        return output;
    }

    static void cobinations( char[] ch, int index, List<String> output ){

            if(index==ch.length){

                output.add(new String(ch));
                return;
            }

            if(Character.isLetter(ch[index])){

                ch[index]=Character.toLowerCase(ch[index]);
                cobinations(ch,index+1,output);

                ch[index]=Character.toUpperCase(ch[index]);
                cobinations(ch,index+1,output);
            }
            
            else{
                
                cobinations(ch,index+1,output);
            }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );

        System.out.println("\nEnter the String : ");
        String s = sc.nextLine();

        List<String> ans = letterCasePermutation( s );
        System.out.println("\nThe Strings formed by letter case Permutation of given string are : \n" + ans );
    }
}
