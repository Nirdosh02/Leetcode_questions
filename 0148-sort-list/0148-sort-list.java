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
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                temp.next=l1;
                temp=l1; 
                l1=l1.next;  
            } else{
                temp.next=l2;
                temp=l2; 
                l2=l2.next;  
            }
        }
        if(l1!=null) temp.next=l1;
        else temp.next=l2;

        return dummy.next;
    }
    public ListNode findmid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if (prev != null) {
            prev.next = null; 
        }
        return slow;
    }

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid = findmid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return merge(left,right);
    }

}
