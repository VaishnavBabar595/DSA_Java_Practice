import java.util.Scanner;

public class RemoveNodes {
    
    //Remove the nodes which have a greater element on its right side
    public static ListNode removeNodes(ListNode head) {
       
        ListNode rev = reverse( head ) ;

        ListNode head1 = new ListNode();
        ListNode prev = head1 ;
        ListNode temp = rev ;
        ListNode temp2 = rev.next ;

        while( temp != null && temp2 != null ){

            if( temp2.val >= temp.val ){

                temp.next = temp2 ;
                temp = temp.next ;
            }

            temp2 = temp2.next ;
        }
        
        temp.next = null ;

        return reverse( rev ) ;
    }

    public static ListNode reverse( ListNode head ){

        ListNode prev = null ;
        ListNode curr = head ;

        while( curr != null ){

            ListNode Next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = Next ;
        }

        return prev ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
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
        head = removeNodes( head);

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
