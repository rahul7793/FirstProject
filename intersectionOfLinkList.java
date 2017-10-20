/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;        
        ListNode B = headB;
        
        ArrayList node = new ArrayList();
        while(A != null){
            node.add(A);
            A = A.next;
        }
        
        
        while(B!=null){
            if(node.contains(B)){
                return B;
            }
            else
                B = B.next;
        }
        return null;
    }
}
