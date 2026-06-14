import java.util.*;

public class maxLengthOfFreqBalancedSubarray {
    
    public static int getLength(int[] nums) { 

        int n = nums.length;
        int ans = 1;

        for (int l = 0; l < n; l++) {

            HashMap<Integer, Integer> freq = new HashMap<>();
            HashMap<Integer, Integer> cnt = new HashMap<>();

            int distinct = 0;
            int mx = 0;

            for (int r = l; r < n; r++) {

                int x = nums[r];

                int oldFreq = freq.getOrDefault(x, 0);

                if (oldFreq > 0) {
                    int c = cnt.get(oldFreq);
                    if (c == 1) cnt.remove(oldFreq);
                    else cnt.put(oldFreq, c - 1);
                } else {
                    distinct++;
                }

                int newFreq = oldFreq + 1;

                freq.put(x, newFreq);
                cnt.put(newFreq, cnt.getOrDefault(newFreq, 0) + 1);

                mx = Math.max(mx, newFreq);

                int len = r - l + 1;

                if (len == 1) {
                    ans = Math.max(ans, len);
                    continue;
                }

                if (distinct == 1) {
                    ans = Math.max(ans, len);
                    continue;
                }

                if ((mx & 1) == 0) {
                    int half = mx / 2;

                    int cMax = cnt.getOrDefault(mx, 0);
                    int cHalf = cnt.getOrDefault(half, 0);

                    if (cMax > 0 &&
                        cHalf > 0 &&
                        cMax + cHalf == distinct) {

                        ans = Math.max(ans, len);
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in ) ;
        System.out.println("\nEnter number of array elements : ");
        int n = sc.nextInt() ;

        int[] nums = new int[n] ;
        System.out.println("\nEnter array elements : ");
        for( int i = 0; i < n ; i++ ){

            nums[i] = sc.nextInt() ;
        }

        int ans = getLength( nums ) ;
        System.out.println("\nThe maximum length of frequency balanced subarray : " + ans );
    }
}
