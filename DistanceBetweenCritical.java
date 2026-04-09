import java.util.Scanner;

public class DistanceBetweenCritical {
    
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        
        int[] ans = { -1 , -1 };
        
        int n = 0 ;
        int lastCritical = -1 ;
        int firstCritical = -1 ;

        ListNode prev = head ;
        ListNode temp = head.next ;
        while( temp != null && temp.next != null ){

            ListNode Next = temp.next ;
            if( (prev.val > temp.val && temp.val < Next.val ) || (prev.val < temp.val && temp.val > Next.val ) ){

                if( lastCritical != -1 ){

                    if( ans[0] == -1 ){

                        ans[0] = n - lastCritical ;
                        ans[1] = n - lastCritical ;
                    }
                    else if( ans[0] > n - lastCritical ){

                        ans[0] = n - lastCritical ;
                    }
                    if( ans[1] < n - firstCritical ){

                        ans[1] = n - firstCritical ;
                    }
                }

                lastCritical = n ;
                if( firstCritical == -1 ){

                    firstCritical = n ;
                }
            }

            prev = temp ;
            temp = temp.next ;
            n++ ;
        }

        return ans ;
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter number of nodes:");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Need at least 3 nodes");
            return;
        }

        System.out.println("Enter node values:");
        ListNode head = new ListNode(sc.nextInt());
        ListNode curr = head;

        for (int i = 1; i < n; i++) {
            curr.next = new ListNode(sc.nextInt());
            curr = curr.next;
        }

        int[] result = nodesBetweenCriticalPoints(head);

        System.out.println("\nMinimum Distance: " + result[0]);
        System.out.println("Maximum Distance: " + result[1]);
    }
}
