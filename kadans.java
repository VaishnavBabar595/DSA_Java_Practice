import java.util.* ;
public class kadans 
{
    public static void kadan(int arr[])
    {
        int crrSum = 0 ,maxSum = Integer.MIN_VALUE ;
        for(int i=0 ; i<arr.length ; i++)
        {
            crrSum = crrSum + arr[i];
            if(crrSum < 0)
            {
                crrSum = 0;
            }
            maxSum = Math.max(maxSum , crrSum);
        }
        System.out.println("maximum Subarray sum is "+maxSum);
    }
    public static void main(String[] args) {
        int array[] = {-5,6,3,-4,-3,9};
        kadan(array);
    }
}
