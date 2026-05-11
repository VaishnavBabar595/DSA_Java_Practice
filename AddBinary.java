import java.util.Scanner;

public class AddBinary {
    
    public static String addBinary(String a, String b) {
        
        int i = a.length() -1 ;
        int j = b.length() -1 ;
        int carry = 0 ;

        StringBuilder sb = new StringBuilder() ;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        sb.reverse();

        return sb.toString() ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );

        System.out.println("\nEnter the 1st binary : ");
        String a = sc.nextLine();

        System.out.println("\nEnter the 2nd binary : ");
        String b = sc.nextLine();

        String ans = addBinary( a , b );
        System.out.println("\nThe ans is : " + ans );
    }
}
