import java.util.Scanner;

public class CountCommasInDigits {
    
    public static int countCommas(int n) {
        
        int ans = 0;
        int start = 1000;
        int commas = 1;

        while (start <= n) {

            long end = start * 1000 - 1;

            if (n < end) {

                ans += (n - start + 1) * commas;
                break;
            } 
            else {
                
                ans += (end - start + 1) * commas;
            }

            start *= 1000;
            commas++;
        }

        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n1 = sc.nextInt();

        int ans = countCommas( n1 );
        System.out.println("\nThe total Commas in 1 to n " + ans );
    }
}
