import java.util.Scanner;

public class AvgSalary {
    
    public static double average(int[] salary) {
        
        double sum = 0 ;
        int max = 0 , min = salary[0] ;
        int n = salary.length ;

        for( int i = 0 ; i < n ; i++ ){

            sum += (double) salary[i] ;
            if( max < salary[i] ) max = salary[i] ;
            if( min > salary[i] ) min = salary[i] ;
        }

        sum = sum - min - max ;
        sum = sum / ( n-2 ) ;
        return sum ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number of employees : ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter salaries : ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        double ans = average(nums1);
        System.out.println("\nThe score difference is : " + ans );
    }
}
