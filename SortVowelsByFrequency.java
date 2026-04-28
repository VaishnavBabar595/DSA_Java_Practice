import java.util.*;

public class SortVowelsByFrequency {
    
    public static String sortVowels(String s) {
        
        int[][] freq = new int[26][2]; 

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                continue;

            if (freq[ch - 'a'][0] == 0)
                freq[ch - 'a'][1] = i;

            freq[ch - 'a'][0]++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                if (freq[a][0] != freq[b][0])
                    return freq[b][0] - freq[a][0];
                return freq[a][1] - freq[b][1];
            }
        );

        for (int i = 0; i < 26; i++) {
            if (freq[i][0] > 0)
                pq.add(i);
        }

        ArrayList<Character> arr = new ArrayList<>();

        while (!pq.isEmpty()) {
            int idx = pq.poll();
            int count = freq[idx][0];

            char ch = (char) ('a' + idx);
            while (count-- > 0) {
                arr.add(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                sb.append(ch);
            } else {
                sb.append(arr.get(j++));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

      Scanner var1 = new Scanner(System.in);

      System.out.println("\nEnter the String : ");
      String var2 = var1.nextLine();

      String var3 = sortVowels(var2);
      System.err.println("\nThe string after sorting the vowels is : " + var3);
   }
}
