/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        
        ListNode t = head;
        
        while(t.next != null ){           
                if(t.next.val == val){
                t.next = t.next.next;
            }
            else
                t = t.next;
        }
        return head.val == val ? head.next : head ;
    }
}
