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
        ListNode slow = headA;
        ListNode fast = headB;
        while(slow!=fast){
            if(slow!=null){ slow=slow.next;}
            else{ slow=headB;}
            if(fast!=null){ fast=fast.next;}
            else{ fast=headA;}
        }
        return slow;
    }
}