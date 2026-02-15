import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToggleLightBulbs {

    public static List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] freq = new boolean[101];

        for(int i = 0 ; i < bulbs.size() ; i++){

            freq[bulbs.get(i)] = !freq[bulbs.get(i)] ;
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < 101 ; i++){

            if( freq[i] ){
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of elements in array : ");
        int n = sc.nextInt();

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter array elements (between 1 to 100): ");
        for (int i = 0; i < n; i++) {
            nums.add( sc.nextInt() );
        }

        List<Integer> ans = toggleLightBulbs(nums);
        System.err.println("The bulbs which are on are : " + ans);
    }
}
