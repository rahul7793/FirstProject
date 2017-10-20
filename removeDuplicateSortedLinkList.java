/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        if(head != null){
            ListNode q = p.next;
            while(q != null)
                if(p.val == q.val){
                    q = q.next;
                 p.next = q;
              }
        else {
                p = q;
                q = q.next;
            }
        }
        return head;
    }
}
