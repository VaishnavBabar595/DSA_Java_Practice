import java.util.Scanner;

public class CompressArray {

    /* The compressed string s should not be returned separately,
       but instead, be stored in the input character array chars.
       Group lengths that are 10 or longer will be split
       into multiple characters in chars
     */
    public static int compress(char[] chars) {
        int insertPosition = 1;
        int count = 1;
        for (int i = 1; i <= chars.length; i++) {
            if (i == chars.length) {
                if (count > 1) {
                    char[] digits = String.valueOf(count).toCharArray();
                    for (char d : digits) {
                        chars[insertPosition++] = d;
                    }
                }
                break;
            }

            if (chars[i - 1] == chars[i]) {
                count++;
            } else {
                if (count > 1) {
                    char[] digits = String.valueOf(count).toCharArray();
                    for (char d : digits) {
                        chars[insertPosition++] = d;
                    }
                }
                count = 1;
                chars[insertPosition] = chars[i];
                insertPosition++;
            }
        }
        return insertPosition;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n = sc.nextInt();

        char[] chars = new char[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            chars[i] = sc.next().charAt(0);
        }

        int ans = compress( chars ) ;
        System.out.println("\n The new compressed array is : \n");
        for (int i = 0; i < ans; i++) {
            System.out.print(chars[i]);
        }
    }
}
