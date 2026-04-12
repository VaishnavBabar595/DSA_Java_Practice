import java.util.HashSet;
import java.util.Scanner;

public class DeleteCommonNodes {
    
    public static ListNode modifiedList(int[] nums, ListNode head) {
        
        HashSet<Integer> set = new HashSet<>() ;
        for( int i = 0 ; i < nums.length ; i++ ){

            set.add( nums[i] );
        }

        ListNode head1 = new ListNode();
        head1.next = head ; 
        ListNode prev = head1 ;
        ListNode temp = head ;

        while( temp != null ){

            if( set.contains( temp.val ) ){

                prev.next = temp.next ;
            }
            else{
                prev = prev.next ;
            }
            temp = temp.next ; 
        }

        return head1.next ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input array (elements to remove)
        System.out.println("\nEnter number of elements in array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("\nEnter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input linked list
        System.out.println("\nEnter number of nodes in linked list : ");
        int m = sc.nextInt();

        System.out.println("\nEnter linked list elements : ");
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int i = 0; i < m; i++) {
            curr.next = new ListNode(sc.nextInt());
            curr = curr.next;
        }

        ListNode head = dummy.next;

        // Print original list
        System.out.print("\nOriginal List: ");
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

        // Call function
        head = modifiedList(nums, head);

        // Print modified list
        System.out.print("\nModified List: ");
        temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
