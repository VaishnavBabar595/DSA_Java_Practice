import java.util.Scanner;

public class RemoveDigit {
    
    public static String removeDigit(String number, char digit) {
        
        int removeIdx = -1;

        for (int i = 0; i < number.length(); i++) {

            if (number.charAt(i) == digit) {

                removeIdx = i; 

                if (i + 1 < number.length()
                    && number.charAt(i + 1) > digit) {

                    removeIdx = i;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder(number);
        sb.deleteCharAt(removeIdx);

        return sb.toString();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in ) ;
        System.out.println("\nEnter the number : " );
        String n = sc.next() ;

        System.out.println("\nEnter the digit : " );
        char digit = sc.next().charAt(0); 

        String ans = removeDigit( n, digit) ;
        System.out.println("\nThe maximum number afer deleting a single occurance of digit is : " + ans );
    }
}
