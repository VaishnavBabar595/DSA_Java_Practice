import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TravelPossible {
    
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = 0 ;
        
        StringBuilder sb = new StringBuilder(); // Use StringBuilder for faster output
        
        while(t-- > 0) {
            String[] nk = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            long k = Long.parseLong(nk[1]);
            
            StringTokenizer stDist = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++) {
                long d = Long.parseLong(stDist.nextToken());
                if(d % k == 0) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
