import java.util.Scanner;

public class RemoveOccurances {
    
    public static String removeOccurrences(String s, String part) {
        
        StringBuilder sb = new StringBuilder(s);

        int ind;

        while( ( ind = sb.indexOf(part) ) != -1 ){
            
            sb.delete( ind , ind + part.length() );
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );

        System.out.println("\nEnter the string : ");
        String s1 = sc.nextLine();

        System.out.println("\nEnter the part : ");
        String s2 = sc.nextLine();

        String ans = removeOccurrences( s1 , s2 );
        System.out.println("\nThe answer string is : " + ans );
    }
}
