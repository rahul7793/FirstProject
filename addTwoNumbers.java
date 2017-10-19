/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        ListNode l3 = new ListNode(0);
        ListNode tail = l3;
        l3.val = (l1.val + l2.val) % 10;
        int carry = (l1.val + l2.val) / 10;
        int sum = 0;
        
        l1 = l1.next;
        l2 = l2.next;
        
        while(l1!=null || l2!=null || carry>0){
            sum = (l1!=null ? l1.val : 0) + (l2!=null ? l2.val : 0) + carry;
            
            ListNode temp = new ListNode(sum%10);
            carry = sum/10;
            
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
            
            tail.next = temp;
            tail = temp;
            
        }
        
        return l3;
        
    }
}
