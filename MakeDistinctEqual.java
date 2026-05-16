import java.util.Scanner;

public class MakeDistinctEqual {
    
    public static boolean isItPossible(String word1, String word2) {
        
        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for(char ch : word1.toCharArray()) {
            f1[ch - 'a']++;
        }

        for(char ch : word2.toCharArray()) {
            f2[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++) {

            if(f1[i] == 0) continue;

            for(int j = 0; j < 26; j++) {

                if(f2[j] == 0) continue;

                f1[i]--;
                f2[j]--;

                f1[j]++;
                f2[i]++;

                int distinct1 = 0;
                int distinct2 = 0;

                for(int k = 0; k < 26; k++) {
                    if(f1[k] > 0) distinct1++;
                    if(f2[k] > 0) distinct2++;
                }

                if(distinct1 == distinct2) {
                    return true;
                }

                f1[i]++;
                f2[j]++;

                f1[j]--;
                f2[i]--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );

        System.out.println("\nEnter the string-1 : ");
        String s1 = sc.nextLine();

        System.out.println("\nEnter the string-2 : ");
        String s2 = sc.nextLine();

        boolean ans = isItPossible( s1 , s2 );
        System.out.println("\nIs it possible to make distinct count equal : " + ans );
    }
}
