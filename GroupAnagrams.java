import java.util.* ;

public class GroupAnagrams {
   
    public static List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap< String , List<String> > map = new HashMap<>() ;

        for( int i = 0 ; i < strs.length ; i++ ){

            String str1 = strs[i];
            char[] arr = str1.toCharArray() ;
            Arrays.sort( arr );

            String str = new String( arr );
            map.putIfAbsent( str , new ArrayList<>() );
            map.get(str).add( str1 ) ;

        }

        return new ArrayList<>( map.values() );
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        System.out.println("\nEnter no of strings : ");
        int n = sc.nextInt() ;
        sc.nextLine();

        String[] strs = new String[n];

        System.out.println("\nEnter Strings :");
        for (int i = 0; i < n; i++) {

            strs[i] = sc.nextLine();
        }

        List<List<String>> ans = groupAnagrams( strs );

        System.out.println("\nThe grouped anagrams are : \n" + ans );
    }
}
