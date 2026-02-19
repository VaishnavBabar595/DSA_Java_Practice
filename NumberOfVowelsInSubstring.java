import java.util.Scanner;

public class NumberOfVowelsInSubstring {
    
    public static int maxVowels(String s, int k) {
        
        int count = 0 ;
        int max = 0 ;

        int l = 0 ;
        int r = 0 ;

        for(r = 0 ; r < k ; r++){

            char ch = s.charAt(r);

            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

                count++ ;
            }
        }

        max = count ;

        for(r = k ; r < s.length() ; r++){

            char ch = s.charAt(r);

            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

                count++ ;
            }

            ch = s.charAt(l) ;
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

                count-- ;
            }
            l++ ;

            if( max < count ) max = count ;
        }

        return max;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the String : ");
        String s = sc.nextLine();

        System.out.println("\nEnter the length of substring : ");
        int k = sc.nextInt();

        int ans = maxVowels(s , k);
        System.err.println("\nThe maximum number of vowels in "+ k + " size substring  : " + ans);

    }
}
