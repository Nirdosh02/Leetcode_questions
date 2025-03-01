/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = head, prev = dummy;
                
        while(cur!=null && cur.next!=null){
            ListNode temp1 = cur.next;
            ListNode temp2 = cur.next.next;
            cur.next=temp2;
            temp1.next=cur;
            prev.next=temp1;

            prev = cur;
            cur=temp2;
        }
        return dummy.next;
    }
}