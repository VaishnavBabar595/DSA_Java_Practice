import java.util.Scanner;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {

        int map1[] = new int[256];
        int map2[] = new int[256];
        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map1[c1] != map2[c2]){
                return false;
            }
            map1[c1] = i+1;
            map2[c2] = i+1;
        } 
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the String1 : ");
        String s = sc.nextLine();

        System.out.println("\nEnter the String2 : ");
        String t = sc.nextLine();

        if( isIsomorphic(s , t) ){
            System.out.println("\n" + s + " and " + t + " are ISOMORPHIC strings .");
        }
        else{
            System.out.println("\n" + s + " and " + t + " are not isomorphic strings .");
        }
    }

}
