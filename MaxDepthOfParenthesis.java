import java.util.Scanner;

public class MaxDepthOfParenthesis {
    
    public static int maxDepth(String s) {
        
        int currentDepth = 0;
        int maxDepth = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (ch == ')') {
                currentDepth--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );

        System.out.println("\nEnter the Expression String : ");
        String s1 = sc.nextLine();

        int ans = maxDepth(s1);
        System.out.println("\nThe maximim depth of parenthesis is : " + ans );
    }
}
