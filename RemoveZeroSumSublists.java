import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 
public class RemoveZeroSumSublists {
    
    public static ListNode removeZeroSumSublists(ListNode head) {
        
        ListNode temp = new ListNode(0, head);

        Map<Integer, ListNode> map = new HashMap<>();
        map.put(0, temp);
        int sum = 0;
        boolean removed = false;

        while(head != null){

            sum += head.val;
            
            if(map.containsKey(sum)){

                map.get(sum).next = head.next;
                removed = true;
            }
            else{

                map.put(sum, head);
            }

            head = head.next;
        }

        return removed ? removeZeroSumSublists(temp.next) : temp.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ListNode head = null, tail = null;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();

            ListNode newNode = new ListNode(val);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.print("\nOriginal List: ");
        printList(head);

        head = removeZeroSumSublists(head);

        System.out.print("After Removal: ");
        printList(head);

    }
}
